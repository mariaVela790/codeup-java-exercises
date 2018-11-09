import java.util.Scanner;


public class StringBonuses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        ================================= JAVA STRING BONUSES
//
//                ----BONUS 1
//
//        Create date format converter application.
//                Take in the following format:
//
//        MM/DD/YYYY
//
//        Output the following:
//
//        MonthName DD, YYYY
//
//        Example:
//
//        input - 12/01/1999
//        output - December 12, 1999
//
        System.out.println("Enter a date as MM/DD/YYYY");
        String date[] = scanner.next().split("/");
//        System.out.println(date.length);

        int month = Integer.valueOf(date[0]);
        int day = Integer.valueOf(date[1]);
        int year = Integer.valueOf(date[2]);

        String dateStr = "";

        switch (month){
            case 1:
                dateStr += "January";
                break;

            case 2:
                dateStr += "February";
                break;
            case 3:
                dateStr += "March";
                break;
            case 4:
                dateStr += "April";
                break;
            case 5:
                dateStr += "May";
                break;
            case 6:
                dateStr += "June";
                break;
            case 7:
                dateStr += "July";
                break;
            case 8:
                dateStr += "August";
                break;
            case 9:
                dateStr += "September";
                break;
            case 10:
                dateStr += "October";
                break;
            case 11:
                dateStr += "November";
                break;
            case 12:
                dateStr += "December";
                break;
            default:
                dateStr += "none";
        }

//        dateStr += " day,"



//
//                ----BONUS 2
//
//        Create an application that allows the user to enter a sentence
//        and tells them how many vowels and consonants were used.
//
//        Example:
//
//        input - "The hill are alive."
//        output - 5 vowels and 10 consonants
//
//
//                ----BONUS 3
//
//        Create a command line calculator application.
//
//        The program should welcome the user, prompt them for a calculation,
//        and give the result. The user should be prompted after each result is
//        outputted if they want to enter another calculation. When they
//        say no, give them an exit message. Allow the user first to specify
//        how many operands they will enter. Do not worry about
//        input validation (assume user enters correct data type).
//
//        Example program:
//
//...
//
//        WELCOME TO THE CALCULATOR APP!!! (program output)
//
//        Do you wish to enter a new calculation? (program output)
//        yes (user inputs this)
//
//        How many operands will you calculate? (program output)
//        2 (user inputs this)
//
//        Please enter a calculation: (program output)
//        2 + 2 (user enters this or something like this)
//        The output of 2 + 2 is 4. (program outputs this)
//
//        Do you wish to enter a new calculation? (program outputs this)
//        no (user enters this)
//
//        GOODBYE!!!
    }
}
