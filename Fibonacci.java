import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the fibonacci number:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int temp=0;
        int count=1;
        System.out.println("Fibonacci Series is:");
        while(count<=n){
            System.out.print(" "+temp);
            temp=b;
            b=b+a;
            a=temp;
            count++;
        }
    }
}
