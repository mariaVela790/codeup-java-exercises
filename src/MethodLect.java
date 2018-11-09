public class MethodLect {
    public static void main(String[] args) {
//        System.out.println(returnFive());
//        String message = returnGreeting("Justin") + " " + niceMessage();
//        System.out.println(message);
//        System.out.println(returnNum(returnFive()));

//        System.out.println(returnTen());
        System.out.println(message());
        System.out.println(message(10));
        System.out.println(message("This is a custom message!"));
        System.out.println(message("This is a custom message!", "pending"));

    }

    ///////////////////////////////Method Overloading/////////////////////////////////////

    public static String message(){
        return "This is a message";
    }

    public static String message(String message){
        return message;
    }

    public static String message(String message, String status) {
        return message + " Status: " + status;
    }

    public static String message(int code){
        return "Code: " + code + " message";
    }

    //////////////////////////////////Methods Intro///////////////////////////////////////
//    public static int returnNum(int num){
//        return num;
//    }
//
//    public static int returnFive() {
//        return 5;
//    }
//
//    public static int returnTen(){
//        return returnFive() + returnFive();
//    }
//    public static String returnGreeting(String name){
//        return String.format("Hello, %s", name);
//    }
//
//    public static String niceMessage(){
//        return "You are great!";
//    }
}
