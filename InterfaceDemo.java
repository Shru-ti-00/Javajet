interface Addition
{
    public void add(int a,int b);
}
interface Subtraction
{
    public void subtract(int a,int b);
} 
interface Multiplication
{
    public void multiply(int a,int b);
}
interface Division
{
    public void divide(int a,int b);
}


public class InterfaceDemo implements Addition,Subtraction,Multiplication,Division 
{
    public void add(int a,int b)
    {
        int sum=a+b;
        System.out.println("Sum="+sum);
    }
    public void subtract(int a,int b)
    {
        int dif=a-b;
        System.out.println("Difference="+dif);
    }
    public void multiply(int a,int b)
    {
        int pro=a*b;
        System.out.println("Product="+pro);
    }
    public void divide(int a,int b)
    {
        try
        {
            int q=a/b;
            System.out.println("Quotient="+q);   
        } 
        catch (Exception e) 
        {
            System.out.println("Cannot divide by zero");
        }
        
    }

    public static void main(String args[])
    {
        InterfaceDemo cal=new InterfaceDemo();
    
        cal.add(9,5);
        cal.subtract(23,16);
        cal.multiply(9,4);
        cal.divide(6,2);
    }
}