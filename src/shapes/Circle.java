package shapes;

public class Circle {
//    private int radius;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double getCircumference(){
        return this.radius * 2 * Math.PI;
    }

}
