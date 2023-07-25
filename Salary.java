import java.util.*;
class Employee
{
    String name,address,mailId;
    long mobileNo;
    double bp,da,hra,pf,club,gross,net;
    int id;
    Employee()
    {
        this.name = "";
        this.address = "";
        this.mailId = "";
        this.mobileNo = 0;
        this.id = 0;
    }
    void getData()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name :");
        name = input.next();
        System.out.println("Enter address :");
        address = input.next();
        System.out.println("Enter mailId :");
        mailId = input.next();
        System.out.println("Enter ID :");
        id = input.nextInt();
        System.out.println("Enter Mobile Number :");
        mobileNo = input.nextLong();
        System.out.println("Enter Basic Pay :");
        bp = input.nextDouble();
    }
    void calculate()
    {
        da = bp * 0.97;
        hra = bp * 0.1;
        pf = bp * 0.12;
        club = bp*0.1;
        gross = bp + da + hra ;
        net = bp + da + hra - pf -club;
    }
}
class ProManager extends Employee
{
    void displayData()
    {
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Mail Id : "+mailId);
        System.out.println("Mobile Number :"+mobileNo);
        System.out.println("ID :"+id);
        System.out.println("DA :" + da);
        System.out.println("HRA :" + hra);
        System.out.println("PF :" + pf);
        System.out.println("Club fund : " + club);
        System.out.println("Gross Salary :" + gross);
        System.out.println("Net Salary :" + net);
    }

}
class AstproManager extends Employee
{
    void displayData()
    {
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Mail Id : "+mailId);
        System.out.println("Mobile Number :"+mobileNo);
        System.out.println("ID :"+id);
        System.out.println("DA :" + da);
        System.out.println("HRA :" + hra);
        System.out.println("PF :" + pf);
        System.out.println("Club fund : " + club);
        System.out.println("Gross Salary :" + gross);
        System.out.println("Net Salary :" + net);
    }
}
class TeamLead extends Employee
{
    void displayData()
    {
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Mail Id : "+mailId);
        System.out.println("Mobile Number :"+mobileNo);
        System.out.println("ID :"+id);
        System.out.println("DA :" + da);
        System.out.println("HRA :" + hra);
        System.out.println("PF :" + pf);
        System.out.println("Club fund : " + club);
        System.out.println("Gross Salary :" + gross);
        System.out.println("Net Salary :" + net);
    }
}
class Programmer extends Employee
{

    void displayData()
    {
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Mail Id : "+mailId);
        System.out.println("Mobile Number :"+mobileNo);
        System.out.println("ID :"+id);
        System.out.println("DA :" + da);
        System.out.println("HRA :" + hra);
        System.out.println("PF :" + pf);
        System.out.println("Club fund : " + club);
        System.out.println("Gross Salary :" + gross);
        System.out.println("Net Salary :" + net);
    }
}
public class Salary {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("\nEnter Role of Employee:");
            System.out.println("1.Programmer\n2.Team Lead\n3.Assistant Program manager\n4.Project Manager\n0.Exit");
            choice = input.nextInt();
            Employee emp = new Employee();
            Programmer prog = new Programmer();
            TeamLead teamLd = new TeamLead();
            AstproManager astPM = new AstproManager();
            ProManager PM = new ProManager();
            switch(choice)
            {

                case 1:
                    prog.getData();
                    prog.calculate();
                    prog.displayData();
                    break;
                case 2:
                    teamLd.getData();
                    teamLd.calculate();
                    teamLd.displayData();
                    break;
                case 3:
                    astPM.getData();
                    astPM.calculate();
                    astPM.displayData();
                    break;
                case 4:
                    PM.getData();
                    PM.calculate();
                    PM.displayData();
                    break;
                case 0 :
                    return;
                default :
                    System.out.println("Enter valid choice");
            }
        }while(choice != 0);
    }
}
