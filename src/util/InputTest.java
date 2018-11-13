package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo("Do you want to continue"));
        input.getInt(1, 10);
    }
}
