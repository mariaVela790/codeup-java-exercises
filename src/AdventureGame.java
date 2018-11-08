import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        Create a command line adventure game...
//        Be creative in communicating with your user different options and for given scenerios.
//        Create at least three phases of the adventure, for example...
//
//                             Home
//                      |             |
//                    Store     or      Park
//                |        |        |         |
//              School  or  Park     Zoo  or  Pool
//                  |
//                  Home
//        Keep the game relatively simple and plan it out clearly before coding it.
        System.out.println("It\'s a beautiful day today, would you like to go to the park or the store");
        String input = scanner.next();
        input = input.toLowerCase();

//        switch(input){
//            case "park":
//                System.out.println("The park is so fun! Would you like to go to the zoo or the pool? ");
//                input = scanner.next();
//                input = input.toLowerCase();
//                switch(input){
//                    case "zoo":
//                        System.out.println("You get to the zoo and see many animals. Time to go home now! ");
////                        input = scanner.next();
////                        input = input.toLowerCase();
//                        break;
//                    case "pool":
//                        System.out.println("You get to the pool and swim. Time to go home now! ");
////                        input = scanner.next();
////                        input = input.toLowerCase();
//                        break;
//                    default:
//                        System.out.println("That option isn\'t available");
//
//                }
//                break;
//
//            case "store":
//                System.out.println("You get to the store and get snacks. Would you like to go to school or the park? ");
//                input = scanner.next();
//                input = input.toLowerCase();
//                switch(input){
//                    case "school":
//                        System.out.println("You get to school but there\'s no school today! You go home and study.");
////                        input = scanner.next();
////                        input = input.toLowerCase();
//                        break;
//                    case "park":
//                        System.out.println("You get to the park but it\'s closed now so you go home.");
////                        input = scanner.next();
////                        input = input.toLowerCase();
//                        break;
//                    default:
//                        System.out.println("That option isn\'t available");
//                }
//                break;
//
//            default:
//                System.out.println("That option isn\'t available");
//
//        }

//        Create a command line Hangman game...
//        Prompt a player 1 to enter a word for player 2 to guess.
//        Track the number of guesses by player 2. Display to the user the partially completed word
//        String lesson methods will be helpful for this bonus


//        System.out.println("hello".toCharArray());

        System.out.println("Player 1, enter a word for Player 2 to guess: ");
        String word = scanner.next();

        System.out.println("Player 2 enter a guess: ");
        char guess = scanner.next().charAt(0);


        for(int numOfGuesses = 0; numOfGuesses <= 20; numOfGuesses++){
            if(word.indexOf(guess) > -1){
                System.out.println("great guess!");

            } else{
                System.out.println("oooh, better luck next time!");
            }
        }



    }
}
