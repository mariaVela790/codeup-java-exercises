package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    private static Input input = new Input(new Scanner(System.in));
    private static HashMap<String, Student> _students = new HashMap<>();


    public static void defaultStudentList(){
        //add usernames
        _students.put("mvela", new Student("Maria"));
        _students.put("ssmith", new Student("Sally"));
        _students.put("fsanders", new Student("Fred"));

        //add three grades
        _students.get("mvela").addGrade(100, 100, 100);
        _students.get("ssmith").addGrade(100, 98, 100);
        _students.get("fsanders").addGrade(100, 90, 100);
    }


    public static int getGrade(){
        return input.getInt("Enter a grade for this student: ");
    }


    private static void getStudents(){
        String menu = "Welcome!\n";
        menu += "Here are the github usernames of our students:\n";
        for(String student : _students.keySet()){
            menu += String.format("|%s| ", student);
        }
        System.out.println(menu);
    }

    private static void getQueryResults(String searchQuery){
        String output = "";
        if(_students.keySet().contains(searchQuery)){ //checks if username is a key and then pulls information for that key
            output += String.format("Name: %s - Github Username: %s %n",_students.get(searchQuery).getName(), searchQuery);
            output += String.format("Current Average: %.2f%n",_students.get(searchQuery).getGradeAverage());
        }
        else{
            output += "Sorry, no student found with the github username of " + searchQuery + "\n";
        }
        System.out.println(output);
    }

    private static void getInput(){
        System.out.println("\nWhat student would you like to see more information on?\n");
        getQueryResults(input.getString());
        if(input.yesNo("Would you like to see another student?\n")){
            getInput();
        } else{
            System.out.println("Goodbye, and have a wonderful day!");
        }
    }

    public static void startGradesApp(){
        getStudents();
        getInput();//sends in the students arrayList and gets input
    }

    public static void main(String[] args) {
        defaultStudentList();
//        makeStudentList();
        startGradesApp();
    }
}
////////////////////////////WORKSPACE BIN
//    public static HashMap<String, Student> defaultStudentList(){
//        //add usernames
//        _students.put("mvela", new Student("Maria"));
//        _students.put("ssmith", new Student("Sally"));
//        _students.put("fsanders", new Student("Fred"));
//
//        //add three grades
//        _students.get("mvela").addGrade(100, 100, 100);
//        _students.get("ssmith").addGrade(100, 98, 100);
//        _students.get("fsanders").addGrade(100, 90, 100);
//        return _students;
//    }

//    public static void makeStudentList(){
//        //add usernames
//        System.out.println(_students.size());
//        for(int i = 0; i < _students.size(); i++){
//            String username = input.getString("Enter student username");
//            String name = input.getString("Enter student name");
//            Student student = new Student(name);
//            _students.put(username, student);
//            _students.get(username).addGrade(getGrade(), getGrade(), getGrade());
//        }
//
//    }
