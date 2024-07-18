import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=in.nextInt();
        int temp=n;
        int ans=0;
        int a=0;
        while(n>0){
            a=n%10;
            ans=ans*10+a;
            n=n/10;   
        }
        if(temp==ans){
            System.out.println("This is a palindrome Number");

        }
        else{
            System.out.println("This is not a palindrome Number");
            System.out.println("Reverse of the number is:"+ans);
        } 
    }
    
}
