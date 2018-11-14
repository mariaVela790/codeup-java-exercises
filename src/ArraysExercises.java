import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);//prints out the reference id to numbers
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Sally");
        people[1] = new Person("Sandra");
        people[2] = new Person("Sean");
        System.out.println();
        for(Person person : people){
            System.out.printf("%s ", person.getName());
        }
        System.out.println();
        people = Person.addPerson(people, new Person("Fred"));

        for(Person person : people){
            System.out.printf("%s ", person.getName());
        }
    }
}
