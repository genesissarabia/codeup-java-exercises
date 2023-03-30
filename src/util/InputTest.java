package util;

public class InputTest {

    public static void main(String[] args) {
        //getString
        System.out.println("Please enter a string");
        Input userString = new Input();
        System.out.println(userString.getString());
        //yesNo
        System.out.println("Please enter yes or no");
        Input userBoolean = new Input();
        System.out.println(userBoolean.yesNo());
        //getInt(empty)
        System.out.println("Please enter a number");
        Input userInteger1 = new Input();
        System.out.println(userInteger1.getInt());
        //getInt(parameters)
        System.out.println("Please enter a number");
        Input userInteger2 = new Input();
        System.out.println(userInteger2.getInt(1, 10));
        //getDouble(empty)
        System.out.println("Please enter a number with a decimal");
        Input userDouble1 = new Input();
        System.out.println(userDouble1.getDouble());
        //getDouble(parameters)
        System.out.println("Please enter a number with a decimal");
        Input userDouble2 = new Input();
        System.out.println(userDouble2.getDouble(11, 20));
    }
}
