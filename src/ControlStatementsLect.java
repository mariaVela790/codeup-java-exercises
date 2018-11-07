public class ControlStatementsLect {
    public static void main(String[] args) {

        String cat1 = "cat";
        String cat2 = "cat";

//        boolean strCompare = (cat1 == cat2); //This solution works but has an edge case so better use .equals()

        boolean strCompare = (cat1.equals(cat2));
        System.out.println(strCompare);


    }
}
