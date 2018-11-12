package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public Input(){
        scanner = new Scanner(System.in);
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }
    public String getString(){
        System.out.println("Enter a string");
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        boolean isYes = false;
        String userInput = getString("Respond with yes or no [yes/y/n/no]");
        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
            isYes = true;
        }
        return isYes;
    }
//
    public int getInt(int min, int max){
        System.out.printf("Please enter an number between %d and %d%n", min, max);
        if(this.scanner.hasNextInt()){
            int userInput = this.scanner.nextInt();
            if((userInput <= max ) && (userInput >= min )){
                System.out.println("You are in the range");
                return 0;
            }else{
                System.out.println("Not in range");
                getInt(min, max);
            }
        } else{
            //refactor to catch errors
            System.out.println("Need to enter a number");
            int userInput = this.scanner.nextInt();
            getInt(min, max);
        }
        return 0;
    }
//
//    public int getInt(){
//
//    }
//
//    public double getDouble(double min, double max){
//
//    }
//
//    public double getDouble(){
//
//    }

//    public static void main(String[] args) {
//        Input input = new Input();
//        System.out.println(input.getString());
//        System.out.println(input.yesNo());
//        input.getInt(1, 10);
//    }

}
