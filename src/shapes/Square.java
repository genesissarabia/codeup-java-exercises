package shapes;

public class Square extends Rectangle{

    protected double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }



//INHERITANCE EXERCISE
    //    private double side;
//
//    public Square(double side){
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
//        return 4*this.side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return Math.pow(this.side, 2);
//    }
//


}
