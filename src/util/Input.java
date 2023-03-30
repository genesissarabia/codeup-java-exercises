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
}
