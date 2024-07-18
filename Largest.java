import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a = in.nextInt();
        System.out.println("Enter a Number:");
        int b = in.nextInt();
        System.out.println("Enter a Number:");
        int c= in.nextInt();
        if(a>b & a>c)
        {
            System.out.println("a is the  largest");
        }
        if(b>a &b>c)
        {
            System.out.println("b is the Largest");
        }
        else{
            System.out.println("c is the Largest");
        }
        in.close();

    }    
}
