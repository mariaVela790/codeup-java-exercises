package shapes;

public class Square extends Rectangle{

    public Square(double side){
        super(side, side);
    }

    public double getPerimeter(){
        return 100 * this.length;
    }

    public double getArea(){
        return Math.pow(this.length, 2);
    }

    public double getSide(){
        return this.length;
    }

}
