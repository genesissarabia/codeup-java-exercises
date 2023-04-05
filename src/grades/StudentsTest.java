package grades;

public class StudentsTest {

    public static void main(String[] args) {
        Student genesis = new Student("Genesis");

        genesis.addGrade(87);
        genesis.addGrade(89);
        genesis.addGrade(96);
        System.out.println(genesis.getGrades());
        System.out.println(genesis.getGradeAverage());



    }


}
