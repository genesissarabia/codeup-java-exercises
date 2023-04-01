import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static int random100(){
        Random rand = new Random();
        int generateRand = rand.nextInt(100) +1;
        return generateRand;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please pick a number between 1 and 100");
        int pickInput = sc.nextInt();
        int correctNumber = random100();
        System.out.println(correctNumber);

            if (pickInput < correctNumber) {
                System.out.println("Higher");
            } else if (pickInput > correctNumber) {
                System.out.println("Lower");
            } else {
                System.out.println("Good Guess!");
            }

    }







}
