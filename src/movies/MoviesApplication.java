package movies;

import util.Input;
import java.util.Scanner;

import static movies.MoviesArray.findAll;

public class MoviesApplication {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        boolean confirm;

        do {
            Input selection = new Input();
            System.out.println("Choose one of the following options: ");
            System.out.println("0 - exit\n1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the sci-fi category");
            Scanner sc = new Scanner(System.in);
            System.out.print("Select an option: ");
            

            Movie[] arrayMovies = findAll();


            switch (selection.getInt(0,5)) {
                case 0:
                    System.out.println("Thank you for using our Movie Application. App closed.");
                    break;

                case 1:
                    for (Movie choice : arrayMovies) {
                        System.out.println(choice.getMovieName() + ", " + choice.getCategory());
                    }
                    break;
                case 2:
                    for (Movie animated : arrayMovies) {
                        if (animated.getCategory().equals("animated")) {
                            System.out.println(animated.getMovieName() + ", " + animated.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie drama : arrayMovies) {
                        if (drama.getCategory().equals("drama")) {
                            System.out.println(drama.getMovieName() + ", " + drama.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie horror : arrayMovies) {
                        if (horror.getCategory().equals("horror")) {
                            System.out.println(horror.getMovieName() + ", " + horror.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie scifi : arrayMovies) {
                        if (scifi.getCategory().equals("scifi")) {
                            System.out.println(scifi.getMovieName() + ", " + scifi.getCategory());
                        }
                    }
                    break;
            }
            System.out.println("Do you want to continue? Yes or No?");
            confirm = sc.next().equalsIgnoreCase("yes");
        } while (confirm);
    }

}
