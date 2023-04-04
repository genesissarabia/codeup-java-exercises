package shapes;

public class Square extends Quadrilateral{


    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public double getPerimeter() {
        return 4*length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
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
