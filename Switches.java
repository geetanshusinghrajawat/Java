import java.util.Scanner;
public class Switches {
    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the fruit you like ");
        String fruit=in.next();
        switch(fruit)
        {
            case "Mango":
            System.out.println("The user likes Mango");
            break;
            case "Apple":
            System.out.println("The user likes Apple");
            break;
            case "Orange":
            System.out.println("The user likes Orange");
            break;
            case "Grapes":
            System.out.println("The user likes Grapes");
            break;
            default:
            System.out.println("Enter a valid fruit");
        }
    }
}
