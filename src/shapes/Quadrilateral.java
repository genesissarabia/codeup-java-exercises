package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //Even though we don't use setWidth and setLength directly from this class (this class here being Quadrilateral), the purpose of that is to just establish that in every class that inherits from this here parent class NEEDS to have a length and a width to function.
    public abstract void setWidth(double width);


    public abstract void setLength(double length);
}
