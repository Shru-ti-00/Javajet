import java.util.*;

public class SearchLinear
{
    public static void main(String args[])
    {
        int size,arr[],i,key,found=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        size=sc.nextInt();
        arr=new int[size]; 

        System.out.println("Enter the elements:");
        for(i=0;i<size;i++)
        {
            arr[i] =sc.nextInt();
        }

        System.out.println("Enter the element to be searched:");
        key=sc.nextInt();

        for(i=0;i<size;i++)
        {
            if(arr[i]==key)
            {
                found=1;
                break;
            }
        }

        if(found==1)
            System.out.println("Element found at index " +i);
        else
            System.out.println("Element not found");

        sc.close();
    }
}