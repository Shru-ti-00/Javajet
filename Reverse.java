import java.util.Scanner;

public class Reverse
{
    public static void main(String[] arg)
    {
        int n,reverse=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        while(n!=0)
        {
            reverse=reverse*10;
            reverse=reverse + n % 10;       //extracted digit added to reverse
            n=n/10;                         //extracted digit dropped from number
        }
        System.out.println("Reverse of the number is "+ reverse);

        sc.close();
    }
}