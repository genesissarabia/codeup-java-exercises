package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setWidth(double width){
        this.width = width;
    };

    @Override
    public void setLength(double length){
        this.length = length;
    };

    @Override
    public double getPerimeter() {
        return 2*length + 2*width;
    }

    //INTERFACES AND ABSTRACT CLASSES:
    //9. Couldn't compile because Java can't override the Abstract getPerimeter in Measurable class.

    @Override
    public double getArea() {
        return length*width;
    }



// INHERITANCE EXERCISE
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getPerimeter() {
//        return 2*this.length + 2*this.width;
//    }
//    public double getArea() {
//        return this.length*this.width;
//    }


}
