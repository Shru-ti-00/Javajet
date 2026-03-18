//Program to add diagonal elements of a 2D array

import java.util.scanner;
public class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,c,i,j;
        System.out.println("Enter the no. of rows:");
        int r= sc.nextInt();

        System.out.println("enter the no. of columns:");
        int c= sc.nextInt();

        int[][] arr= new int[r][c];
        
        System.out.println("Enter the elements of the array:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                int arr[i][j]=sc.nextInt();
            }
        }

        int sum=0;

        //Sum of diagonal elements (only for square matrix)
        if(r==c)
        {
            for(i=0;i<r;i++)
            {
                sum+=arr[i][i];
            }
            System.out.println("Sum of the diagonal elements are:"+sum);
        }
        else
        {
            system.out.println("Diagonal sum only possible for square matrices.");
        }

        sc.close();
    }
}