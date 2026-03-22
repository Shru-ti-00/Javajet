import java.util.*;

public class reverseArray
{
    public static void main(String args[])
    {
        int arr1[],arr2[],size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        size=sc.nextInt();
        
        arr1 =new int[size];
        arr2 =new int[size];

        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++)
        {
            arr1[i] =sc.nextInt();
        }
        
        System.out.println("Original Array:");
        System.out.print("[");
        for(int i=0;i<size;i++)
        {
            System.out.print(" "+ arr1[i]);
        }
        System.out.print("]");
        System.out.println("\nReversed Array:");
        System.out.print("[");
        int len=size;
        for(int i=size-1,j=0;i>=0;i--,j++)
        {
            arr2[j]=arr1[i];
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(" "+ arr2[i]);
        }
        System.out.print("]");
    }
}