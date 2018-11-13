package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {

        createCircles();
    }
    public static void createCircles(){
        Input input = new Input(new Scanner(System.in));
        int numOfCircles = 0;
        boolean continueUser;

        do{
            int radius = input.getInt("Enter a radius to create a circle: ");
            input.getString();
            Circle circle1 = new Circle(radius);

            System.out.printf("The area is %.2f%n", circle1.getArea());
            System.out.printf("The circumference is %.2f%n", circle1.getCircumference());
            numOfCircles++;
            continueUser = input.yesNo("Would you like to create more circles? ");

        }while(continueUser);

        System.out.printf("You\'ve made %d circles", numOfCircles);
    }
}
