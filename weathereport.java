import java.util.*;

class weather{
    int day;
    float hightemp, lowtemp, rainamt, snowamt;

    public weather(){
        day=0;
        hightemp=0;
        lowtemp=0;
        rainamt=0;
        snowamt=0;
    }

    public weather(int day, float hightemp, float lowtemp, float rainamt, float snowamt)
    {
        this.day=day;
        this.hightemp=hightemp;
        this.lowtemp=lowtemp;
        this.rainamt=rainamt;
        this.snowamt=snowamt;
    }

    public void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day");
        day = sc.nextInt();
        System.out.println("enter the high temp");
        hightemp= sc.nextFloat();
        System.out.println("enter the low temp");
        lowtemp= sc.nextFloat();
        System.out.println("enter the rain amount");
        rainamt= sc.nextFloat();
        System.out.println("enter the snow amount");
        snowamt = sc.nextFloat();

    }
}
public class weathereport {
    public static void main(String[] args)
    {
        int n,i;
        float hightemp =0, lowtemp=0, rainamt=0, snowamt=0;
        System.out.println("enter the no. of days");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        weather [] w = new weather[n];
        for(i=0; i<n; i++)
        {
            w[i]=new weather();
            w[i].getdata();
        }
        for(i=0; i<n; i++)
        {
            hightemp=(hightemp + w[i].hightemp);
            lowtemp=(lowtemp + w[i].lowtemp);
            rainamt=(rainamt+ w[i].rainamt);
            snowamt=(snowamt + w[i].snowamt);
        }

        System.out.println("average high temperature: " + hightemp/n);
        System.out.println("average low temperature: " + lowtemp/n);
        System.out.println("average amount of rain: " + rainamt/n);
        System.out.println("average amount of snow: " + snowamt/n);
    }
}
