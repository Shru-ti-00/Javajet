import java.util.Scanner;

public class selectionSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of the elements:");
        int size=sc.nextInt();
        
        int[] arr=new int[size];
        
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        //Sorting
        for(int i=0;i<size;i++)
        {
            int smallest=i;
            for(int j=i+1;j<size;j++)
            {
                if(arr[smallest]>arr[j])
                    smallest=j;
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }
        System.out.println("Sorted array:");
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
} 