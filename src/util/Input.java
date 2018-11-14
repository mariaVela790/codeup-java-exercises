package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(Scanner scanner){
        this.scanner = scanner;
    }

    public String getString(){
        return this.scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        boolean isYes = false;
        String userInput = getString( "Respond with yes or no [yes/y/n/no]");
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));
    }
    public boolean yesNo(String prompt){
        boolean isYes = false;
        String userInput = getString(prompt + "Respond with yes or no [yes/y/n/no]");
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));
    }
//    public boolean yesNo(String prompt){
//        boolean isYes = false;
//        String userInput = getString(prompt + "Respond with yes or no [yes/y/n/no]");
//        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
//            isYes = true;
//        }
//        return isYes;
//    }
//
//
    public int getInt(){
        if(!scanner.hasNextInt()){
            scanner.nextLine();
            return getInt();
        } else{
//            System.out.println(prompt);
            return scanner.nextInt();
        }
    }

    public int getInt(int min, int max){
        System.out.printf("Please enter an number between %d and %d%n", min, max);
        int userInt = getInt();
        if((userInt <= max ) && (userInt >= min )){
//            System.out.println("You are in the range");
            return userInt;
        }else{
            System.out.println("Invalid selection");
            return getInt(min, max);
        }
    }

    public double getDouble(double min, double max){
        double userDouble;

        do{
            //runs once assuming user inputs correctly
            System.out.println("Enter a double between " + min + " and " + max);
            userDouble = this.scanner.nextDouble();

            if(this.scanner.hasNextDouble()){
                if(userDouble <= max && userDouble >= min){
                    System.out.println("In range");
                    return userDouble;
                }
            }

//            if(!this.scanner.hasNextDouble()){//
//                System.out.println("Enter an integer");
//            } else{
//                userDouble = this.scanner.nextDouble();
//                if(userDouble <= max && userDouble >= min){
//                    System.out.println("In range");
//                    return userDouble;
//                }
//            }

        }while(!this.scanner.hasNextDouble());//keeps running while user keeps inputting incorrect info


        return 0;
    }

//    public double getDouble(double min, double max){
//        System.out.printf("Please enter an number between %d and %d%n", min, max);
//        if(this.scanner.hasNextDouble()){
//            double userDouble = this.scanner.nextDouble();
//            if((userDouble <= max ) && (userDouble >= min )){
//                System.out.println("You are in the range");
//                return userDouble;
//            }else{
//                System.out.println("Not in range");
//                getDouble(min, max);
//            }
//        }
//        return 0;
//    }

    public int getInt(String prompt){
        if(!scanner.hasNextInt()){
            scanner.nextLine();
            return getInt();
        } else{
            System.out.println(prompt);
            return scanner.nextInt();
        }
    }
//
//    public double getDouble(double min, double max){
//
//    }
//
    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

//    public static void main(String[] args) {
//        Input input = new Input();
//        System.out.println(input.getString());
//        System.out.println(input.yesNo());
//        input.getInt(1, 10);
//    }

}
