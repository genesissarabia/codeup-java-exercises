import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person genesis = new Person("Genni");
        Person isleny = new Person("Lenny");
        Person larissa = new Person("Atzi");

        Person[] threePeople = {genesis, isleny, larissa};

        for(Person onePerson: threePeople){
            System.out.println(onePerson.getName());
        }

    }

//    public static Person addPerson(String [] args){
//
//
//
//
//
//    }





//    public static String addPerson(String[] args) {
//
//        String[] persons = new String[1];
//
//        System.out.println(persons.length);
//
//    }
}
