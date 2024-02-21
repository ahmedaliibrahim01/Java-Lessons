import java.util.Scanner;

public class Java_03_Hypotenuse_Calculator {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number a : ");
        a = input.nextInt();
        System.out.print("Enter Number b : ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Your hypotenuse number is : " + c);
    }
}
