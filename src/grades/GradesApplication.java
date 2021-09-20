package grades;

import java.util.HashMap;
import java.util.Scanner;
import util.Input;

public class GradesApplication {
    public static Scanner sc = new Scanner(System.in);
    public static Input input = new Input();
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student jeff = new Student("El_Jefe");
        jeff.addGrade(25);
        jeff.addGrade(100);
        jeff.addGrade(45.79);
        Student bob = new Student("Bobert123");
        bob.addGrade(75);
        bob.addGrade(98.34);
        bob.addGrade(68.79);
        Student fred = new Student("xXxFredxXx");
        fred.addGrade(25);
        fred.addGrade(100);
        fred.addGrade(45.79);
        Student fyodor = new Student("Fyodor_Notstoyevsky");
        fyodor.addGrade(85.73);
        fyodor.addGrade(98.02);
        fyodor.addGrade(94.79);

        students.put("Jeff",jeff);
        students.put("Bob",bob);
        students.put("Fred",fred);
        students.put("Fyodor",fyodor);

//I did not get enough sleep so this is the solution my tired mind came up with
        boolean keepCheckingGrades = true;
        while(keepCheckingGrades){
            System.out.println("Welcome!\nHere are the GitHub usernames of our students:\n");
            System.out.println(students.keySet());
            System.out.println("Which student would you like to see more information on?");
            String userInput = sc.nextLine();
            if (students.get(userInput) == null){
                if(userInput.equalsIgnoreCase("class average")){

                }
                System.out.println("Sorry, no student with that name was found.");
                continue;
            }
            System.out.printf("Name: %s - GitHub Username: %s\nCurrent Average: %s\nGrades: %s\n", userInput, students.get(userInput).getName(), students.get(userInput).getGradeAverage(), students.get(userInput).getGrades());
            //now we see if they want to continue
            System.out.println("Would you like to continue viewing grades?");
            if(!input.yesNo()){
                keepCheckingGrades = false;
            }
        }
    }
}
