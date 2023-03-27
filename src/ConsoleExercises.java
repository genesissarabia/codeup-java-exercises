import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String [] args){


        //1.
        double pi = 3.14159;
        System.out.format("The value of pi is approximately " + pi);

        //Scanner Class

        //1.
        Scanner input = new Scanner(System.in);

        System.out.printf("\nPick a number please.");

        int numberInput = input.nextInt();

        System.out.println("\nThanks for picking a number! The number you picked is " + numberInput);

        //2.

        Scanner userString = new Scanner(System.in);

        System.out.printf("\nType in any three words please.");

        String firstWord = userString.next();
        String secondWord = userString.next();
        String thirdWord = userString.next();

        System.out.println("\nYour first word is: " + firstWord);
        System.out.println("\nYour second word is: " + secondWord);
        System.out.println("\nYour third word is: " + thirdWord);
        System.out.println("If you have more than three words, it ain't showin' up because there are no more variables to print!");

        //3.

        Scanner userSentence = new Scanner(System.in);

        System.out.println("\nPlease type in a sentence.");

//        String sentenceInput = userSentence.next();--> only captures first word
        //4.
        String sentenceInput = userSentence.nextLine();

        System.out.println("\nSentence input: " + sentenceInput);

        //Calculate perimeter and area of room

        //1.

        //Two scanner objects
        Scanner inputLength = new Scanner(System.in);
        Scanner inputWidth = new Scanner(System.in);

        System.out.println("\nPlease enter the length of your room.");


        int roomLength = inputLength.nextInt();

        System.out.println(roomLength + " ft.");

        System.out.println("\nPlease enter the width of your room in feet.");

        int roomWidth = inputWidth.nextInt();

        System.out.println(roomWidth + " ft.");

        System.out.println("\nPerimeter: " + ((roomWidth + roomLength)*2) + " ft.");
        System.out.println("\nArea: " + (roomWidth * roomLength) + " ft.");
    }

}
