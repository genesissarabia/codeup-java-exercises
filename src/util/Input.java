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
        try {
            int integerInput = Integer.valueOf(getString());
            return integerInput;
        } catch (NumberFormatException e){
            System.out.println("(No Parameters) int Error: " + e.getMessage());
            e.printStackTrace();
            return 0;
        }
//        return 0;
    }
    //parameter getInt
    public int getInt(int min, int max){
        try {
            int integerInput = Integer.valueOf(getString());
            if (integerInput < min || integerInput > max) {
                System.out.println("Please enter a number within the range.");
                return getInt(min, max);
            } else {
                return integerInput;
            }
        } catch (NumberFormatException e){
            System.out.println("(Parameters) int Error: " + e.getMessage());
            e.printStackTrace();
            return 0;
        }
    }
    //double(empty)
    public double getDouble(){
        try{
            double doubleInput = Double.valueOf(getString());
            return doubleInput;
        } catch (NumberFormatException e){
            System.out.println("(No parameters) Double Error: " + e.getMessage());
            return 0;
        }
    }
    //getDouble(parameters)
    public double getDouble(double min, double max){
        try {
            double doubleInput = Double.valueOf(getString());
            if (doubleInput < min || doubleInput > max) {
                System.out.println("Please enter a number within the range.");
                return getDouble(min, max);
            } else {
                return doubleInput;
            }
        } catch(NumberFormatException e){
            System.out.println("(Parameters) Double Error: " + e.getMessage());
            return 0;
        }
    }
}
