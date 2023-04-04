package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5, 4);
        Measurable myShape2 = new Square(5);

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        System.out.println(myShape2.getPerimeter());
        System.out.println(myShape2.getArea());
//        System.out.println(myShape.getLength());
        //10. Java can't find getLength in Measurable because it doesn't exist in there. It shows that Java tracks it back in Quadrilateral but only because it's connected by "implements Measurable" in the class?

// INHERITANCE EXERCISE
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Square box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

    }
}
