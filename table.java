import java.util.Scanner;
   //Adding the new comment for this codeṇ
public class table
{
    void prnTable(int num)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(num*i);
        }
    }

    //main method
    public static void main(String args[])
    {
     
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to print it's table: ");
        num=sc.nextInt();
        table obj=new table();
        obj.prnTable(num);   //Calling prnTable() method 
    }
}