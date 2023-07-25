import java.util.Scanner;
class Stack_operations
{
    int top;
    int maxsize = 4;
    int[] arr = new int[maxsize];
    boolean isEmpty()
    {
        return (top < 0);
    }
    Stack_operations()
    {
        top = -1;
    }
    boolean push (Scanner sc)
    {
        if(top == maxsize-1)
        {
            System.out.println("Stack Overflow");
            return false;
        }

        System.out.println("Enter Value") ;
        int val = sc.nextInt();
        top++;
        arr[top]=val;
        System.out.println("Element pushed");
        return true;
    }
    boolean pop ()
    {
        if (top == -1)
        {
            System.out.println("Stack Underflow");
            return false;
        }
        else
        {
            top --;
            System.out.println("Element removed");
            return true;
        }
    }
    void display ()
    {
        System.out.println("Stack ==> ");
        for(int i = top; i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
public class Stack {
    public static void main(String[] args)
    {
        int choice=0;
        Scanner sc = new Scanner(System.in);
        Stack_operations s = new Stack_operations();
        do
        {
            System.out.println("Menu ==> ");
            System.out.println("\n1.Push\n2.Pop\n3.Show\n0.Exit");
            System.out.print("Enter choice : ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    try
                    {
                        s.push(sc);
                    }
                    catch(ArrayIndexOutOfBoundsException e)
                    {
                        System.out.println("Index out of bounds");
                    }
                    break;
                }
                case 2:
                {
                    s.pop();
                    break;
                }
                case 3:
                {
                    s.display();
                    break;
                }
                case 0:
                {
                    return;
                }
                default:
                {
                    System.out.println("Enter valid choice ");
                }
            }
        }while(choice != 0);
    }
}
