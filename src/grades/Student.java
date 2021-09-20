package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    public ArrayList<Double> getGrades(){
        return this.grades;
    }
    // adds the given grade to the grades property
    public void addGrade(double grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double gradeTotal = 0;
        for(int i = 0; i < grades.size(); i++){
            gradeTotal += grades.get(i);
        }
        return gradeTotal/grades.size();
    }


    public static void main(String[] args) {
        Student jeff = new Student("jeff");
        jeff.addGrade(25);
        jeff.addGrade(100);
        jeff.addGrade(45.79);
        System.out.println(jeff.getGradeAverage());
    }
}
