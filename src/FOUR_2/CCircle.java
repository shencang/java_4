package FOUR_2;

public class CCircle extends CShape{
    double radius;

    public double  GetArea(double radius) {
        this.radius = radius;
        return Math.PI * this.radius * this.radius;


    }
}

