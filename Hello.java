interface addition{
    int add(int a,int b);
}
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World ");

        addition add=((a,b)->a+b);
        System.out.println(add.add(6, 8));

    }
}
