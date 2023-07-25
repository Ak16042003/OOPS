import java.util.Scanner;

abstract class Shapeclass{

    double val1,val2;

    abstract public void compute_area();

    abstract public void input();

}

class rectangle extends Shapeclass{

    Scanner in = new Scanner(System.in);

    public void input() {

        System.out.println("Enter length : ");

        this.val1 = in.nextDouble();

        System.out.println("Enter breadth : ");

        this.val2 = in.nextDouble();

    }

    public void compute_area()

    {

        double ans=val1*val2;

        System.out.println("\nArea of rectangle is : "+ans);

    }

}

class triangle extends Shapeclass{

    Scanner in = new Scanner(System.in);

    public void input() {

        System.out.println("\nEnter height : ");

        val1 = in.nextDouble();

        System.out.println("Enter base : ");

        val2 = in.nextDouble();

    }

    public void compute_area()

    {

        double ans=0.5*val1*val2;

        System.out.println("\nArea of triangle is : "+ans);

    }

}
public class shape {
    public static void main(String[] args) {

        Shapeclass S;

        rectangle R=new rectangle();

        triangle T=new triangle();

        S=R;

        S.input();

        S.compute_area();

        S=T;

        S.input();

        S.compute_area();

    }
}
