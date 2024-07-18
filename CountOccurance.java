import java.util.Scanner;
public class CountOccurance {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= in.nextInt();
        System.out.print("Enter the digit you want the occurance of:");
        int a=in.nextInt();
        int rem=0;
        int count=0;
        while(n>0){
            rem=n%10;
            if (rem==a)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println("The given number is repeated "+count+" times");
    }
}
