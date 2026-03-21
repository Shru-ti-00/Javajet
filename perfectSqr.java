import java.util.*;

public class perfectSqr
{
    public static void main(String ags[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        
        double srt=Math.sqrt(num);
        int sqroot=(int)srt;

        if(sqroot*sqroot==num)
            System.out.println(num + " is a perfect square.");
        else
            System.out.println(num + " is not a perfect square.");
        
    }
}