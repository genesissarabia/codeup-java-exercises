package shapes;

public class Square extends Quadrilateral{


    public Square(double side) {
        super(side, side);
    }


    //For setWidth and setLength, we needed to add inside this.width/length because we needed to establish that in each setMethod, no matter if it was named setWidth or setLength specifically, we were changing both. With this being said, for squares, length and width are literally the same, and if we didn't establish that, Java would recognize it as a type of rectangle. So again, because we are establishing in both setMethods the length and width are both being changed, it will be able to recognize that the length and width are for a square. This also comes into play due to the constructor above, "side" is length and width recognized from the Quadrilateral constructor it's inheriting from.
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
