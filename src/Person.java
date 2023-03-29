public class Person {

    private String name;

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public String sayHello(){
//TODO: print a message to the console using the person's name
        return String.format("Hi and welcome, %s", this.name);
    }

    public static void main(String[] args) {
        Person Genesis = new Person();

        Genesis.setName("Genni");
        System.out.println(Genesis.getName());
        System.out.println(Genesis.sayHello());
    }

}
