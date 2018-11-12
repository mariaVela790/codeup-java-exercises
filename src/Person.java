public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello " + this.name);
    }

    public static void main(String[] args) {
//        Person me = new Person("Maria");
//        System.out.println(me.getName());
//        me.setName("Monsy");
//        System.out.println(me.getName());
//        me.sayHello();


//        Person person1 = new Person("John"); //Creates person object with
//        //name property set to John
//
//        Person person2 = new Person("John");//Creates another person object
//        //with the name property equal to John
//
//        System.out.println(person1.getName().equals(person2.getName()));
//        //outputs true or false depending on whether or not the name property of person1
//        //is equal to the name property of person2-TRUE
//
//        System.out.println(person1 == person2);//checks if person1 and person2 refer
//        //to the same person object which is FALSE

////////////////////////////////////////////////////////////////////////////
//        Person person1 = new Person("John");//creates a person object and assigns
//        //its reference to person1
//        Person person2 = person1;//assigns the reference to person1
//
//        System.out.println(person1 == person2);//TRUE because the two variables refer to the
//        //same object

////////////////////////////////////////////////////////////////////////////
//        Person person1 = new Person("John");//creates a person object
//        Person person2 = person1;//assigns reference to person1 object
//        System.out.println(person1.getName());//"john"
//        System.out.println(person2.getName());//"john
//        person2.setName("Jane");//sets name for person1 object to Jane
//        System.out.println(person1.getName());//Jane
//        System.out.println(person2.getName());//Jane

/////////////////////////////////////////////////////////////////////////////


    }
}
