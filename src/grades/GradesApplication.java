package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student jeff = new Student("Jeff");
        jeff.addGrade(25);
        jeff.addGrade(100);
        jeff.addGrade(45.79);
        Student bob = new Student("Bob");
        jeff.addGrade(75);
        jeff.addGrade(98.34);
        jeff.addGrade(68.79);
        Student fred = new Student("Fred");
        jeff.addGrade(25);
        jeff.addGrade(100);
        jeff.addGrade(45.79);

        students.put(jeff.getName(),jeff);
        students.put(bob.getName(),bob);
        students.put(fred.getName(),fred);



    }
}
