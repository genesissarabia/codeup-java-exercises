package shapes;

import util.Input;
import java.util.Scanner;
public class CircleApp {

    public static void main(String[] args) {
        System.out.println("Please enter a radius. ");
        Input myInput = new Input();
        Circle newCircle = new Circle(myInput.getDouble());

        System.out.println(newCircle.getCircumference());
        System.out.println(newCircle.getArea());

    }
}
