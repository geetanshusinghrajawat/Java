import java.util.Scanner;
public class Methods {
    public static void main(String[] args) 
    {
        sum1();
        int ans1=sum2();
        System.out.println("The sum return datatype is: "+ans1);
        //In argument methods the value is given before
        int ans2=sum3(12,30);
        System.out.println("The sum with argument method is: "+ans2);
    }
    //function with no return value
    static void sum1()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter num 1:");
        int num1=in.nextInt();
        System.out.print("Enter num 2:");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("The sum = "+sum);
    }
    //funtion with return value
    static int sum2()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter num 1:");
        int num1=in.nextInt();
        System.out.print("Enter num 2:");
        int num2=in.nextInt();
        int sum=num1+num2;
        //when the value is returned the value of method is changed
        //the return value should have same datatype else will show error
        return sum;
    }

    //functions with arguments
    //the arguments are passed in the method 
    static int sum3(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
}
