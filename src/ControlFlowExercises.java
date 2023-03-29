import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //1.

        //a.

//        int i = 5;
//
//        while (i <= 15){
//            System.out.println(i++);
//        }

        //b.
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);

//        for (int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//        }

//        long i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//
//        } while (i < 66000);

//        for (long i = 2; i <= 1000000; i*=i) {
//            System.out.println(i);
//        }


        //2.

//        for(int i=0; i<=100; i++){
//            boolean divide3 = (i%3)==0;
//            boolean divide5 = (i%5)==0;
//
//            if(divide3 && divide5){
//                System.out.println("fizzBuzz");
//            } else if (divide5){
//                System.out.println("buzz");
//            } else if (divide3){
//                System.out.println("fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //3.

//        Scanner sc = new Scanner(System.in);
//
//        boolean confirm;
//
//        do {
//            System.out.print("\nPick a number please.");
//
//            int userInput = sc.nextInt();
//
//            System.out.printf("\nHere's the table with the squares and cubes.");
//
//            System.out.println("\nnumber | squared | cubed");
//            System.out.println("\n------ | ------- | -----");
//
//            for (int i = 1; i <= userInput; i++) {
//                System.out.printf(i + "      | " + i * i + "       | " + i * i * i + "\n");
//            }
//
//            System.out.println("Do you want to continue? Yes or No?");
//            confirm = sc.next().equalsIgnoreCase("yes");
//        } while(confirm);

        //4.

        Scanner sc = new Scanner(System.in);
        boolean confirm;

        do {
            System.out.print("\nPlease enter a number from 0-100");
            int userInput = sc.nextInt();

                if (userInput < 60) {
                    System.out.println("F");
                } else if (userInput < 67){
                    System.out.println("D");
                } else if (userInput < 80){
                    System.out.println("C");
                } else if (userInput< 88){
                    System.out.println("B");
                } else if (userInput < 101){
                    System.out.println("A");
                }

            System.out.println("Do you want to continue? Yes or No?");
            confirm = sc.next().equalsIgnoreCase("yes");

        } while (confirm);


    }
}
