import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        vehiclee v = null;

        int y;
        repeat:
        do
        {
            System.out.print("select vehicle\n1.Bicycle \n2.Car\n3.Bike \n4.exit \nenter choice : ");
            y = input.nextInt();
            if(y == 1)
            {
                v = new Bicycle();
            }
            else if(y == 2)
            {
                v = new Car();
            }
            else if(y == 3)
            {
                v = new Bike();
            }
            else if(y == 4)
            {
                break repeat;
            }
            else
            {
                System.out.println("invalid input");
            }
            if(y < 4)
            {
                repeat2:
                do
                {
                    System.out.print("1.increase speed\n2.change gear\n3.apply brakes\n4.display current status\n5.change vehicle\nenter choice : ");
                    int z = input.nextInt();
                    switch(z)
                    {
                        case 1:
                            v.speedUp();
                            break;

                        case 2:
                            System.out.print("enter gear : ");
                            int a = input.nextInt();
                            v.gearChange(a);
                            break;

                        case 3:
                            v.applyBrakes();
                            break;

                        case 4:
                            v.display();
                            break;

                        case 5:
                            break repeat2;

                        default:
                            System.out.println("invalid input");
                    }
                }while(true);
            }
        }while(y!=4);
    }
}
interface vehiclee
{
    void gearChange(int a);
    void speedUp();
    void applyBrakes();
    void display();
}

class Bicycle implements vehiclee
{
    int gear , speed;

    Bicycle()
    {
        System.out.println("Bicycle started");
        gear = 0;
        speed = 0;
    }

    public void gearChange(int gearex)
    {
        if(gearex < 7 && gearex > 0)
        {
            gear = gearex;
            System.out.println("current gear : "+gear);
        }
        else
        {
            System.out.println("gear out of bound");
        }
    }

    public void speedUp()
    {
        if((speed + 5) < 50 )
        {
            speed += 5;
            System.out.println("current speed is "+speed);
        }
        else
        {
            System.out.println("max speed of 50 reached");
        }
    }

    public void applyBrakes()
    {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("1.decrease speed\n2.stop bicycle\nenter choice : ");
        x = input.nextInt();
        if(x == 1)
        {
            if((speed-5) > 0)
            {
                speed -= 5;
                System.out.println("current speed : " + speed);
            }
            else
            {
                speed=0;
                gear=0;
                System.out.println("bicycle stopped");
            }
        }
        if(x == 2)
        {
            speed = 0;
            gear = 0;
            System.out.println("bicycle stopped");
        }
    }

    public void display()
    {

        System.out.println("speed : " + speed + " gear : " + gear);
    }
}


class Car implements vehiclee
{
    int gear , speed;
    Car()
    {
        System.out.println("car started");
        gear = 0;
        speed = 0;
    }
    public void gearChange(int gearex)
    {
        if(gearex < 7 && gearex > 0)
        {
            this.gear = gearex;
            System.out.println("current gear : " + gear);
        }
        else
        {
            System.out.print("gear out of bounds\n");
        }
    }
    public void speedUp()
    {
        if((speed + 20) < 150 )
        {
            speed += 20;
            System.out.println("current speed : " + speed);
        }
        else
        {
            System.out.println("max speed of 150 reached");
        }
    }
    public void applyBrakes()
    {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("1.decrease speed\n2.stop car\nenter choice : ");
        x = input.nextInt();
        if(x == 1)
            if((speed - 20) > 0)
            {
                speed -= 20;
                System.out.println("current speed : " + speed);
            }
            else
            {
                speed = 0;
                gear = 0;
                System.out.println("car stopped");
            }
        if(x == 2)
        {
            speed = 0;
            gear = 0;
            System.out.println("car stopped");
        }
    }

    public void display()
    {
        System.out.println("speed : " + speed + " gear : " + gear);
    }
}


class Bike implements vehiclee
{
    int gear,speed;
    Bike()
    {
        System.out.println("bike started\n");
        gear = 0;
        speed = 0;
    }
    public void gearChange(int gearex)
    {
        if(gearex < 6 && gearex > 0)
        {
            gear = gearex;
            System.out.println("current gear : " + gear);
        }
        else
        {
            System.out.println("gear out of bounds \n");
        }
    }
    public void speedUp()
    {
        if((speed + 20) < 100)
        {
            speed += 20;
            System.out.println("current speed is " + speed +" .\n");
        }
        else
        {
            System.out.println("max speed of 100 reached");
        }
    }
    public void applyBrakes()
    {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("1.decrease speed\n2.stop bike\nenter choice : ");
        x = input.nextInt();
        if(x == 1)
            if((speed - 20) > 0)
            {
                speed -= 20;
                System.out.println("current speed :  " + speed);
            }
            else
            {
                speed = 0;
                gear = 0;
                System.out.println("bike stopped\n");
            }
        if(x == 2)
        {
            speed =0;
            gear = 0;
            System.out.println("bike stopped\n");
        }
    }
    public void display()
    {
        System.out.println("speed : " + speed + " gear : " + gear + "\n");
    }
}
