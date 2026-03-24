import java.util.*;

public class PerfectNum
{
    public static void main(String args[])
    {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();

        //Find divisors and add them
        for(int i=0;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }

        //Checking perfect number
        if(sum==num)
        {
            System.out.println(num + " is a Perfect Number.");
        }
        else
        {
            System.out.println(num + " is not a Perfect Number.");
        }

        sc.close();

    }
}