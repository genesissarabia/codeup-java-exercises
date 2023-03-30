package util;

import java.util.Scanner;
public class Input {

    private Scanner sc;

    public Input(){
        sc = new Scanner(System.in);
    }

    //GetString
    public String getString(){
        String stringInput = sc.nextLine();
        return stringInput;
    }
    //Boolean
    public boolean yesNo(){
        String booleanInput = sc.next();
        if(booleanInput.equals("yes")){
            return true;
        }
            return false;

    }
    //empty getInt
    public int getInt(){
        int integerInput = sc.nextInt();
        return integerInput;
    }
    //parameter getInt
    public int getInt(int min, int max){
        int integerInput = sc.nextInt();
        if (integerInput < min || integerInput > max){
            System.out.println("Please enter a number within the range.");
            return getInt(min, max);
        } else {
            return integerInput;
        }
    }
    //double(empty)
    public double getDouble(){
        double doubleInput = sc.nextDouble();
        return doubleInput;
    }
    //getDouble(parameters)
    public double getDouble(double min, double max){
        double doubleInput = sc.nextDouble();
        if (doubleInput < min || doubleInput > max){
            System.out.println("Please enter a number within the range.");
            return getDouble(min, max);
        } else {
            return doubleInput;
        }
    }

//    public static void main(String[] args) {
//        //getString
//        System.out.println("Please enter a string");
//        Input userString = new Input();
//        System.out.println(userString.getString());
//        //yesNo
//        System.out.println("Please enter yes or no");
//        Input userBoolean = new Input();
//        System.out.println(userBoolean.yesNo());
//        //getInt(empty)
//        System.out.println("Please enter a number");
//        Input userInteger1 = new Input();
//        System.out.println(userInteger1.getInt());
//        //getInt(parameters)
//        System.out.println("Please enter a number");
//        Input userInteger2 = new Input();
//        System.out.println(userInteger2.getInt(1, 10));
//        //getDouble(empty)
//        System.out.println("Please enter a number with a decimal");
//        Input userDouble1 = new Input();
//        System.out.println(userDouble1.getDouble());
//        //getDouble(parameters)
//        System.out.println("Please enter a number with a decimal");
//        Input userDouble2 = new Input();
//        System.out.println(userDouble2.getDouble(11, 20));
//    }


}
