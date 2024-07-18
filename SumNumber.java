import java.util.Scanner;
public class SumNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First number:");
        int num1=input.nextInt();
        System.out.println("Enter Second Number2:");
        int num2=input.nextInt();
        int num3=num1+num2;
        System.out.println("Sum of Numbers is:"+num3);
    }
}
