import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter any operator:");
        int ans=0;
        while(true)
        {
            char op=in.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/')
            {
                System.out.print("Enter num1:");
                int num1=in.nextInt();
                System.out.print("Enter num2:");
                int num2=in.nextInt();
                if(op=='+')
                {
                    ans=(num1+num2);
                }
                if(op=='-')
                {
                    ans=(num1-num2);
                }
                if(op=='*')
                {
                    ans=(num1*num2);
                }
                if(op=='/')
                {
                    if(num2!=0)
                    {
                    ans=(num1/num2);
                    }
                }
            }
            else if(op=='x'||op=='X')
                {
                    break;
                }
            else
            {
                System.out.println("Invalid Operator");
            }
            System.out.println("The answer is:"+ans);
        }
        in.close();
    }
}
