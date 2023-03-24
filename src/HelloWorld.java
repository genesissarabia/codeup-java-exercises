public class HelloWorld {
    public static void main(String [] args) {
        System.out.println("Hello world!");
        System.out.print("Hi World");
        System.out.print("Hello Earth");

        //1.
        int myFavoriteNumber = 27;
        System.out.println("\nMy favorite number is " + myFavoriteNumber);

        //2.
        String myString = "Howdy, y'all!";
        System.out.println(myString);

        //3.
        //myString = 3.1459;
        //from build output regarding trying to change myString variable to number:
        //"incompatible types: double cannot be converted to java.lang.String"

        //4.
        //long myNumber;
        //System.out.println(myNumber);
        //from console when tried to run: "java: variable myNumber might not have been initialized"

        //5.
        //long myNumber = 3.14;
        //from console when tried to run: "java: incompatible types: possible lossy conversion from double to long"

        //6.
        //long myNumber = 123L;

        //7.
        //myNumber = 123;
        //123 has compiled but not 3.14, possibly because it's a double(it has floating numbers (decimals))?

        //8.
        //float myNumber = 3.14;
        //from console when tried to run: "java: incompatible types: possible lossy conversion from double to float", thinking to change data type

        //9.
        double myNumber = 3.14;
        System.out.println(myNumber);
        //Changed data type to double

        //10.
//        int x = 5;
//        System.out.println(x++);//returns the original value at first
//        System.out.println(x); // returns the updated value
        //int x = 5;
        //System.out.println(++x); //returns the new value immediately
        //System.out.println(x);//returns the new value again

        //11.
        //String class = "myClass";
        //console returns: "java: not a statement"

        //12.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";

        //13.
//        int x = 4;
//        x+=5;
        //System.out.println(x);

//        int x=3;
//        int y=4;
////        y = y*x;
////            y *=x;
//
//        System.out.println(y);
        int x = 10;
        int y = 2;
        x /= y;
//        y =- x;
        System.out.println(y);


        //14.
        System.out.println(Integer.MAX_VALUE);

    }
}
