import java.util.Scanner;
public class Conditions
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Salary");
        int salary=in.nextInt();
        if (salary>10000)
        {
            System.out.println("Salary is greater than 10000");
            salary=salary+1000;
        }
        else
        {
            System.out.println("Salary is greater than 10000");
            salary=salary+2000;
        }
        System.out.println("salary with bonus is:"+salary);
    }

}
