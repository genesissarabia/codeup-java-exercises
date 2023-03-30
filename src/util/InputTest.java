package util;

public class InputTest {

    public static void main(String[] args) {
        //getString
        System.out.println("Please enter a string");
        Input myInput = new Input();
        System.out.println(myInput.getString());

        //yesNo
        System.out.println("Please enter yes or no");
        System.out.println(myInput.yesNo());

        //getInt(empty)
        System.out.println("Please enter a number");
        System.out.println(myInput.getInt());

        //getInt(parameters)
        System.out.println("Please enter a number");
        System.out.println(myInput.getInt(1, 10));

        //getDouble(empty)
        System.out.println("Please enter a number with a decimal");
        System.out.println(myInput.getDouble());

        //getDouble(parameters)
        System.out.println("Please enter a number with a decimal");
        System.out.println(myInput.getDouble(11, 20));
    }
}
