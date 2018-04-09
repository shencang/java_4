package FOUR_2;

public class CRectsangle extends CShape{
    double  length;
    double   width;


  public double   GetArea(double length ,double width){
      this.length=length;
      this.width=width;

      return   this.length*this.width;

  }
}
