import java.util.Scanner;
public class Temprature {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Temprature in Celcius:");
        float celcius=in.nextFloat();
        float Fehrenhite=(celcius*9/5)+32;
        System.out.println("Temprature in Fehrenhite is:"+Fehrenhite);
        

    }
}
