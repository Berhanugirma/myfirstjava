import java.util.Scanner;

public class HelloWorld {
    public static void main(String[]args){
        System.out.println("Hello World");
        int num=0;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("enter a number");
        num= keyboard.nextInt();
        System.out.println(num);
    }
}
