import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//        System.out.println(addNums(1,2));
//        System.out.println(subtractNums(1,2));
//        System.out.println(multiplyNums(1,2));
//        System.out.println(divideNums(1,0));

//        System.out.println(nFactorial(4));
//        System.out.println("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.println(userInput);
//        String factorialStr = getFactorial();
//        System.out.println(factorialStr);
//        System.out.println(diceRoll());
//        System.out.println(multiplyNums(3, 8));

    }

//    Create an application that simulates dice rolling.
//
//    -Ask the user to enter the number of sides for a pair of dice.
//    -Prompt the user to roll the dice.
//    -"Roll" two n-sided dice, display the results of each, and then ask the user if
//    he/she wants to roll the dice again.
//    -Use static methods to implement the method(s) that generate the random numbers.
//    -Use the .random method of the java.lang.Math class to generate random numbers.
////////////////////////////////////////////////////////////////////////////////////////////
//
//    public static String diceRoll(){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the number of sides on the di: ");
//        int numOfDiSides = scanner.nextInt();
//
//        String roll = String.format("You rolled a %d and a %d", diceNum(numOfDiSides), diceNum(numOfDiSides));
//        return roll;
//    }

//    public static int diceNum(int numOfSides){
//       return 1 + (int)(Math.random() * numOfSides + 1);
//    }

////////////////////////////////////////////////////////////////////////////////////////////
//    public static long factorialOf(int n){
//        if(n == 0){
//            return 1;
//        }
//        long nFactorial = n * factorialOf(n - 1);
//        return nFactorial;
//    }

//    public static String createFactorialStr(int input){
//        String outputStr = String.format("%d! = ", input);
//        for (int i = 1; i <= input; i++){
//            if(i == input){
//                String formatting = "%-" + input + "d = %d%n";
//                outputStr += String.format(formatting, i, factorialOf(input));
//            } else{
//                outputStr += String.format("%d X ", i);
//            }
//        }
//        return outputStr;
//    }
//

//    public static String getFactorial(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number from one to ten: ");
//        int input = scanner.nextInt();
//        System.out.println("grabbed input");
//        String outputStr = "";
//
////        for (int i = 1; i <= input; i++){
////            System.out.println("in loop");
////
////        }
//        for(int i = 1; i <= input; i++){
//            outputStr += createFactorialStr(i);
//        }
//        return outputStr;
    }

////////////////////////////////////////////////////////////////////////////////////////////
//    public static int getInteger(int min, int max){
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//
//        if(input >= min && input <= max){
//            return input;
//        } else{
//            System.out.println("Enter a valid number:");
//            return getInteger(min, max);
//        }
//    }
//
//    public static double addNums(double num1, double num2){
//        return num1 + num2;
//    }
//    public static double subtractNums(double num1, double num2){
//        return num1 - num2;
//    }

////////////////////////////////////////////////////////////////////////////////////////////
//    public static int multiplyNums(int num1, int num2){
//        //
//        //        //problem statement: take in two numbers and add first number to itself
//        //        //Step 1:Take in two numbers
//        //        //Step 2:
//        //
//        //        if(num2 == 0){
//        //            return num1;
//        //        }
//        //        multiplyNums(num1, num2 - 1);
//        if(num2 == 0){
//            return 0;
//        }
//
//        return num1 + multiplyNums(num1, num2 - 1);
//        //////////////////////////////////////////////////////
//        //        return num1 * num2;
//        //
//        //////////////////////////////////////////////////////
//        //        int num3 = 0;
//        //        for(int i = 1; i <= num2; i++){
//        //            num3 += num1;
//        //        }
//        //        return num3;
//    }


////////////////////////////////////////////////////////////////////////////////////////////
//    public static int divideNums(int num1, int num2){
//        return num1 / num2;
//    }

////////////////////////////////////////////////////////////////////////////////////////////
//    public static double divideNums(double num1, double num2){
//        return num1 / num2;
//    }

//}
