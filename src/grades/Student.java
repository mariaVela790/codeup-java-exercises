package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String _name;
    private List<Integer> _grades;

    public Student(String name){
        this._name = name;
        this._grades = new ArrayList<>();
    }

    public String getName(){
        return this._name;
    }

    public void addGrade(int grade){
        _grades.add(grade);
    }

    public void addGrade(int grade1, int grade2, int grade3){
        addGrade(grade1);
        addGrade(grade2);
        addGrade(grade3);
    }

    public List<Integer> getGrades(){
        return _grades;
    }

    public double getGradeAverage(){
        int sumOfGrades = 0;
        for(Integer grade : _grades){
            sumOfGrades += grade;
        }
        return (double)sumOfGrades / _grades.size();
    }

    public static void main(String[] args) {
        Student me = new Student("Maria");
        me.addGrade(100);
        me.addGrade(90);
        System.out.println(me.getGrades());
    }


}
