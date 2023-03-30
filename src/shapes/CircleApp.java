package shapes;

public class CircleApp {

    public static void main(String[] args) {

        Circle shape1 = new Circle(4.5);
//        Circle shape2 = new Circle(5.3);

        System.out.println(shape1.getCircumference());
        System.out.println(shape1.getArea());

    }
}
