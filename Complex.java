import java.util.*;
class ComplexOperations
{
    //data members
    int real , img;
    //default constructor
    ComplexOperations()
    {
        real = 0;
        img = 0;
    }
    //parameterised constructor
    ComplexOperations(int real , int img)
    {
        this.real = real;
        this.img = img;
    }
    //member functions
    void Addition(ComplexOperations num1 , ComplexOperations num2)
    {
        int real,img;
        real = num1.real + num2.real;
        img = num1.img + num2.img;
        System.out.println("Answer is : (" + real + ") + (" + img + ")i ");
    }
    void Subtraction(ComplexOperations num1 , ComplexOperations num2)
    {
        int real,img;
        real = num1.real - num2.real;
        img = num1.img - num2.img;
        System.out.println("Answer is : (" + real + ") + (" + img + ")i ");
    }
    void Multiplication(ComplexOperations num1 , ComplexOperations num2)
    {
        int real,img;
        real = (num1.real*num2.real) - (num1.img*num2.img);
        img = (num1.real*num2.img) + (num1.img * num2.real);
        System.out.println("Answer is : (" + real + ") + (" + img + ")i ");
    }
    void Division(ComplexOperations num1 , ComplexOperations num2)
    {
        int real,img;
        real =( (num1.real*num2.real) + (num1.img * num2.img) ) / ( (num2.real * num2.real) + (num2.img * num2.img) );
        img = ( (num1.img * num2.real) - (num1.real * num2.img)  ) / ( (num2.real * num2.real) + (num2.img * num2.img) );
        System.out.println("Answer is : (" + real + ") + (" + img + ")i ");
    }
}
public class Complex {
    public static void main(String[] args)
    {
        int real,img;
        int ch;
        Scanner input = new Scanner(System.in);
        ComplexOperations calculate = new ComplexOperations();
        do
        {
            System.out.print("\n\n1.addition\n2.subtraction\n3.multiplication\n4.division\n0.exit\nenter choice : ");
            ch = input.nextInt();
            switch(ch)
            {
                case 1:
                {
                    //first complex no input
                    System.out.print("first number \n");
                    System.out.print("real part : ");
                    real = input.nextInt();
                    System.out.print("img part : ");
                    img = input.nextInt();
                    ComplexOperations num1 = new ComplexOperations(real , img);

                    //second complex no input
                    System.out.print("second number \n");
                    System.out.print("real part : ");
                    real = input.nextInt();
                    System.out.print("img part : ");
                    img = input.nextInt();
                    ComplexOperations num2 = new ComplexOperations(real , img);
                    calculate.Addition(num1 , num2);
                    break;
                }
                case 2:
                {
                    //first complex no input
                    System.out.print("first number \n");
                    System.out.print("real part : ");
                    real = input.nextInt();
                    System.out.print("img part : ");
                    img = input.nextInt();
                    ComplexOperations num1 = new ComplexOperations(real , img);

                    //second complex no input
                    System.out.print("second number \n");
                    System.out.print("real part : ");
                    real = input.nextInt();
                    System.out.print("img part : ");
                    img = input.nextInt();
                    ComplexOperations num2 = new ComplexOperations(real , img);

                    calculate.Subtraction(num1 , num2);
                    break;
                }
                case 3:
                {
                    //first complex no input
                    System.out.print("first number \n");
                    System.out.print("real part : ");
                    real = input.nextInt();
                    System.out.print("img part : ");
                    img = input.nextInt();
                    ComplexOperations num1 = new ComplexOperations(real , img);

                    //second complex no input
                    System.out.print("second number \n");
                    System.out.print("real part : ");
                    real = input.nextInt();
                    System.out.print("img part : ");
                    img = input.nextInt();
                    ComplexOperations num2 = new ComplexOperations(real , img);

                    calculate.Multiplication(num1, num2);
                    break;
                }
                case 4:
                {
                    //first complex no input
                    System.out.print("first number \n");
                    System.out.print("real part : ");
                    real = input.nextInt();
                    System.out.print("img part : ");
                    img = input.nextInt();
                    ComplexOperations num1 = new ComplexOperations(real , img);

                    //second complex no input
                    System.out.print("second number \n");
                    System.out.print("real part : ");
                    real = input.nextInt();
                    System.out.print("img part : ");
                    img = input.nextInt();
                    ComplexOperations num2 = new ComplexOperations(real , img);

                    calculate.Division(num1, num2);
                    break;
                }
                case 0:
                    return;
                default :
                    System.out.print("enter valid choice\n");
            }

        }while(ch!=0);
    }
}
