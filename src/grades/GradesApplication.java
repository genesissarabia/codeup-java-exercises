package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student genesis = new Student("Genni");
        Student firat = new Student("Firat");
        Student lenny = new Student("Isleny");
        Student atzi = new Student("Atzi");

        students.put("genesissarabia", genesis);
        students.put("dcelebi", firat);
        students.put("lennuriostegui", lenny);
        students.put("anataniasar", atzi);

        genesis.addGrade(87);
        genesis.addGrade(78);
        genesis.addGrade(94);
        firat.addGrade(97);
        firat.addGrade(84);
        firat.addGrade(98);
        lenny.addGrade(96);
        lenny.addGrade(88);
        lenny.addGrade(100);
        atzi.addGrade(88);
        atzi.addGrade(92);
        atzi.addGrade(77);


        userInput(students);

    }

    public static void userInput(HashMap<String, Student> students){

        boolean confirm;

        System.out.println("Welcome to the Grades Portal. Here are our current students: \n");

        for (String userName:students.keySet()){
            System.out.println(userName);
        }

        do{
            Input input = new Input();
            System.out.println("Which student would you like to access?\n");
            String userInput = input.getString();
            Scanner sc = new Scanner(System.in);

            if(students.containsKey(userInput)){
                System.out.println("Student Name: " + students.get(userInput).getName());
                System.out.println("Student GitHub Username: " + userInput);
//                System.out.println("Student Grades: " + students.getGrades());
                System.out.printf("Grade Average: %.2f", students.get(userInput).getGradeAverage());
            } else {
                System.out.println("Student username not found. Please enter another username.");
            }
            System.out.println("\nWould you like to view another student profile?");
            confirm = sc.next().equalsIgnoreCase("yes");
            if (!confirm){
                System.out.println("Exiting program. Thank you for using our Grades Portal.");
            }
        } while(confirm);


    }





}
