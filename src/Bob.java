import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Would you like to talk to Bob?");
//        String talkToBob = scanner.next();
//        scanner.nextLine();

        String talkToBob;

        do{
            System.out.println("Say something to Bob: ");
            String input = scanner.nextLine();
            String bobResponse;

            if(input.endsWith("?")){
                bobResponse = "Sure.";

            } else if(input.endsWith("!")){
                bobResponse = "Whoa, chill out!";


            } else if(input.equals("")){//can also use isEmpty()

                bobResponse = "Fine. Be that way!";
            } else {

                bobResponse = "Whatever.";
            }
            //bobResponse what bob says
            System.out.println(bobResponse);


            //ask if user wants to talk to bob more
            System.out.println("\nWould you like to talk to Bob? yes or no");
            talkToBob = scanner.next();
            scanner.nextLine();

        }while(!talkToBob.equals("no"));

//        while(talkToBob.equals("yes")){
//            System.out.println("Say something to Bob: ");
//            String input = scanner.nextLine();
//
//            if(input.endsWith("?")){
//                System.out.println("Sure.");
//
//            } else if(input.endsWith("!")){
//
//                System.out.println("Whoa, chill out!");
//
//            } else if(input.isEmpty()){
//
//                System.out.println("Fine. Be that way!");
//            } else {
//
//                System.out.println("Whatever.");
//            }
//
//            System.out.println("\nWould you like to talk to Bob?");
//            talkToBob = scanner.next();
//            scanner.nextLine();
//        }

    }
}
