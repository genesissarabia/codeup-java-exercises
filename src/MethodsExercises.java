import java.util.Scanner;
public class MethodsExercises {

    //1.
    public static void main(String [] args){
//        System.out.println(add(4, 5));
//        System.out.println(subtract(4, 5));
//        System.out.println(multiply(4, 5));
//        System.out.println(division(20, 5));
//        System.out.println(modulus(20, 5));

        getInteger(1, 10);

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

//    public static int getInteger(int min, int max){
//        Scanner numberInput = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int number = numberInput.nextInt();
//
//        if (max < number || min > number){
//            System.out.println("Not within range, please enter another number.");
//            return getInteger(min, max);
//        }
//        System.out.println("Your number is valid! Your number is: " + number);
//        return number;
//    }

    //3.

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int number = sc.nextInt();
        boolean confirm;

        do {
            System.out.print("\nPlease enter a number from 0-100");
            long userInput = sc.nextInt();

            if (max < number || min > number){
                System.out.println("Not within range, please enter another number.");
                return getInteger(min, max);
            } else {
                System.out.println("Your number is valid! Your number is: " + number);
                return number;
            }

            System.out.printf("Do you want to continue? Yes or No?");
            confirm = sc.next().equalsIgnoreCase("yes");

        } while (confirm);
    }

}
