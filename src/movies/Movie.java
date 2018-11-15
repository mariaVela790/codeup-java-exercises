package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class Movie {
    private String name;
    private String category;
    private static Scanner scanner = new Scanner(System.in);
    private static Input input = new Input(scanner);

    public Movie(){ }

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return this.category;
    }


    public static void movieMenu(){
        System.out.println("\n----------------- Menu -------------------");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - add a movie");

    }
    public static Movie[] filterMovies(Movie[] movies, String category){
        Movie[] filteredMovies = new Movie[0];
        for(Movie movie : movies){
            if(movie.getCategory().equals(category)){
                filteredMovies = addToCurrentMovies(filteredMovies, movie);
            }
        }
        return filteredMovies;
    }

    public static void printMovies(Movie[] movies){
        for(Movie movie : movies){
            System.out.printf("Name: %s Category: %s%n", movie.getName(), movie.getCategory());
        }
    }

    public static Movie[] addToCurrentMovies(Movie[] movies, Movie movie){
        Movie[] currentMovies = Arrays.copyOf(movies, movies.length + 1);
        currentMovies[currentMovies.length - 1] = movie;
        return currentMovies;
    }

    public static Movie newMovie(){
        System.out.print("Enter movie name: ");
        input.getString();
        String name = input.getString();
        System.out.print("Enter movie category: ");
        String category = input.getString();
        return (new Movie(name, category));
    }

    public static void printMovieResults(int userSelection){
        Movie[] filteredMovies;
        Movie[] movies = Arrays.copyOf(MoviesArray.findAll(), MoviesArray.findAll().length);

        switch (userSelection){
            case 0:
                System.out.println("Exiting");
                break;
            case 1:
                printMovies(movies);
                break;
            case 2:
                filteredMovies = filterMovies(movies, "animated");
                printMovies(filteredMovies);
                break;
            case 3:
                filteredMovies = filterMovies(movies, "drama");
                printMovies(filteredMovies);
                break;
            case 4:
                filteredMovies = filterMovies(movies, "horror");
                printMovies(filteredMovies);
                break;
            case 5:
                filteredMovies = filterMovies(movies, "scifi");
                printMovies(filteredMovies);
                break;
            case 6:
                movies = addToCurrentMovies(movies, newMovie());
                printMovies(movies);
                break;
            default:
                System.out.println("Not a valid selection");
                break;
        }
    }

    public static void startMovieApplication(){
        int userSelection;
        do{
            movieMenu();
            userSelection = input.getInt(0, 6);
            printMovieResults(userSelection);
        }while (userSelection != 0);
    }
}
