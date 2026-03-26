import java.util.Scanner;

public class CountEvenOdd
{
    public static void main(String args[])
    {
        int size,odd=0,even=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        size=sc.nextInt();
        int[] arr=new int[size];

        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();

            if(arr[i]%2==0)
                even++;
            else
                odd++;
        }

        System.out.println("Even elements:" + even);
        System.out.println("Odd elements:" + odd);

        sc.close();

    }
}