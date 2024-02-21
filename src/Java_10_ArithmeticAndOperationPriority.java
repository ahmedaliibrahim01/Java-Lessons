import java.util.Scanner;

public class Java_10_ArithmeticAndOperationPriority {
    public static void main(String[] args) {
        int a, b, c, result;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a : ");
        a = input.nextInt();
        System.out.print("Enter b : ");
        b = input.nextInt();
        System.out.print("Enter c : ");
        c = input.nextInt();
        result = a+b*c-b;
        System.out.println("Your result : " + result);
    }
}
