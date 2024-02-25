import java.util.Scanner;

public class Java_38_Tip_Dönüşümleri_Casting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Integer Number: ");
        int intNumber = scanner.nextInt();

        System.out.print("Enter Double Number: ");
        double doubleNumber = scanner.nextDouble();

        double intToDouble = (double) intNumber;
        System.out.println("Integer converted to double: " + intToDouble);

        int doubleToint = (int) doubleNumber;
        System.out.println("Double converted to Integer: " + doubleToint);
    }
}
