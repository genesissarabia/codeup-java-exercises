import java.util.Random;
import java.util.Scanner;
public class MethodsExercises {

    //1.
    public static void main(String [] args){
//        System.out.println(add(4, 5));
//        System.out.println(subtract(4, 5));
//        System.out.println(multiply(4, 5));
//        System.out.println(division(20, 5));
//        System.out.println(modulus(20, 5));

        System.out.println(getFactorial());

    }

//    public static int add(int x, int y){
//        return x+y;
//    }
//    public static int subtract(int x, int y){
//        return x-y;
//    }
//    public static int multiply(int x, int y){
//        return x*y;
//    }
//    public static int division(int x, int y){
//        return x/y;
//    }
//    public static int modulus(int x, int y){
//        return x%y;
//    }

    //2.

    public static int getInteger(int min, int max){
        Scanner numberInput = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int number = numberInput.nextInt();

        if (max < number || min > number){
            System.out.println("Not within range, please enter another number.");
            return getInteger(min, max);
        }
        System.out.println("Your number is valid! Your number is: " + number);
        return number;
    }

    //3.

    public static long getFactorial(){
        long input = getInteger(1, 10);
        long total = 1;
        for (long i=1; i <= input; i++){
            total *= i;
        }
        return total;
    }

    //4.

//    public static int rollDice(int n){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("How many sides on your dice? ");
//        int input = sc.nextInt();
//
//        Random randomNum = new Random();
//        for (int i = 0; i < input; i++) {
//
//        }
//
//
//
//
//
//
//    }




}
