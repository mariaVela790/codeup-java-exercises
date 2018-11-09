import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
    //    Welcome to the world of game development!
    //
    //    You are going to build a high-low guessing game.
    //    Create a class named HighLow inside of src.
    //
    //    The specs for the game are:
    //
    //    Game picks a random number between 1 and 100.
    //    Prompts user to guess the number
    //    All user inputs are validated
    //    If user's guess is less than the number, it outputs "HIGHER"
    //    If user's guess is more than the number, it outputs "LOWER"
    //    If a user guesses the number, the game should declare "GOOD GUESS!"
        System.out.println(highLowGame());

    }
    public static String highLowGame(){
        Scanner scanner = new Scanner(System.in);

        int randomNum = (int)(Math.random() * 100 + 1);
        int numOfGuesses = 0;

        System.out.println(randomNum);
//        System.out.println("Enter a guess for the number: ");
        int userGuess;

        do{
            System.out.println("Enter a guess for the number: ");
            userGuess = scanner.nextInt();
            if(userGuess == randomNum){
                System.out.println("GOOD GUESS!");
            } else if(userGuess > randomNum){
                System.out.println("LOWER");
            } else{
                System.out.println("HIGHER");
            }
            numOfGuesses++;

        }while(userGuess != randomNum && numOfGuesses <= 5 && keepPlaying());

        return String.format("You made %d guesses and the random number was %d", numOfGuesses, randomNum);
    }
    public static boolean keepPlaying(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Want to keep playing? [y/n]");
        String playingStill = scanner.next();

        if(playingStill.equals("y")){
            return true;
        } else if(playingStill.equals("n")){
            return false;
        } else{
            return keepPlaying();
        }
    }
}
