import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {



    //1.
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person genesis = new Person("Genni");
        Person isleny = new Person("Lenny");
        Person larissa = new Person("Atzi");

        Person[] peopleList = {genesis, isleny, larissa};

        for(Person onePerson: peopleList){
            System.out.println(onePerson.getName());
        }
        System.out.println("~~~~~~~~~~~~");
        Person[] newList = addPerson(peopleList, new Person("Bryan"));
        for (Person onePerson: newList){
            System.out.println(onePerson.getName());
        }
    }

    public static Person[] addPerson(Person [] currentPeople, Person newPerson){

        Person[] newPersonArray = Arrays.copyOf(currentPeople, currentPeople.length + 1);

        newPersonArray[currentPeople.length] = newPerson;
        return newPersonArray;

    }





//    public static String addPerson(String[] args) {
//
//        String[] persons = new String[1];
//
//        System.out.println(persons.length);
//
//    }
}
