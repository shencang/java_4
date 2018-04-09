import FOUR_1.Employee;
import FOUR_1.HourlyWorker;
import FOUR_1.Worker;
import FOUR_2.CCircle;
import FOUR_2.CRectsangle;
import FOUR_2.CShape;

public class Main {

    public static void main(String[] args){
        Employee emp= new Employee();
        HourlyWorker hour= new HourlyWorker();
        Worker work =new Worker();

        CRectsangle cr1=new CRectsangle();
        CCircle cr2=new CCircle();
        System.out.println(cr1.GetArea(1000,243));
        System.out.println(cr2.GetArea(100));

    }
}
