import java.util.Scanner;
//import java.util.Float;

public class ConsoleExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        double pi = 3.14159;
//        System.out.println("The value of pi is approximately " + pi);
//        System.out.format("The value of pi is approximately %.2f", pi);

//        System.out.printf("hello $ %.2f", (1000 / 100.00));

//        System.out.println("Enter an integer: ");
//        int input = scanner.nextInt();
//        System.out.println(input);
//
//        System.out.print("Enter three words: ");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);


//        System.out.println("Enter a sentence: ");
//        String sentenceInput = scanner.nextLine();
//
//        System.out.println(sentenceInput);

//        System.out.println("Enter the length and width of the classroom: ");
////        scanner.useDelimiter(" ");
//
////        String input = scanner.nextLine();
////        int length = Integer.parseInt(scanner.nextLine());
////        int width = Integer.parseInt(scanner.nextLine());
//
//        float length = Float.parseFloat(scanner.nextLine());
//        float width = Float.parseFloat(scanner.nextLine());
//        float height = Float.parseFloat(scanner.nextLine());
//
////        System.out.println(input + " " + input2);
////        float length = Float.StringToFloat(scanner.nextLine());
//
////        int area = length * width;
////        int perimeter = (2 * length) + (2 * width);
//        float area = length * width;
//        float perimeter = (2 * length) + (2 * width);
//        float volume = length * width * height;
//
////        System.out.printf("The area is %d and the perimeter is %d", area, perimeter);
//        System.out.printf("Area: %.2f%nPerimeter: %.2f%nVolume: %.2f%n", area, perimeter, volume);

//////////////////Bonus/////////////////////////////////////////////////////////////////////////
//        The Scanner class can be told specifically what characters or pattern separates tokens in a
//        piece of input with the useDelimeter method. Add the following line of code to your application
//        after you have created a scanner (assuming the variable the holds the scanner is named scanner):
//
//
//        scanner.useDelimeter("\n");

//        How does this change the way your program operates?
//
//        Rewrite your classroom calculating program to use nextInt method. If you added the line of
//        code above to your application, you should now have no trouble handling multiple pieces of user input.


        System.out.println("Enter the length and width of the classroom: ");
        scanner.useDelimiter("\n");


        float length = Float.parseFloat(scanner.next());
        float width = Float.parseFloat(scanner.next());
        float height = Float.parseFloat(scanner.next());


        float area = length * width;
        float perimeter = (2 * length) + (2 * width);
        float volume = length * width * height;

        System.out.printf("Area: %.2f%nPerimeter: %.2f%nVolume: %.2f%n", area, perimeter, volume);


    }
}
