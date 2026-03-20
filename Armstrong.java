import java.util.*;

public class Armstrong
{
    public static void main(String args[])
    {
        int n,sum=0,temp,rem,digits=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        temp=n;

        //Count number of digits
        while(temp!=0)
        {
            digits++;
            temp=temp/10;
        }
        temp=n;
        while(temp!=0)
        {
            rem=temp%10;
            sum=sum+power(rem,digits);
            temp=temp/10;
        }
        if(n==sum)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }

    static int power(int r,int d)
    {
        int i,p=1;
        for(i=1;i<=d;i++)
        {
            p=p*r;
        }
        return p;
    }
}