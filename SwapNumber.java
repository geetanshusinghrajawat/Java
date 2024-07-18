import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=input.nextInt();
        System.out.println("Enter the value of b");
        int b=input.nextInt();
        int c=0;
        c=a;
        a=b;
        b=c;
        System.out.println("Swaped Numbers are:"+a+","+b);



    }
    
}
