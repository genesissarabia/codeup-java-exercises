package shapes;

public class Circle {

    private double radius;

    public Circle(){}

    public Circle (double radius){
        this.radius = radius;
    }

    public double getCircumference(){
        double circumference = 2 * Math.PI * this.radius;
        return circumference;
    }

    public double getArea(){
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }


}



