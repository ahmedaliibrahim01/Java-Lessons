import java.util.Scanner;
public class Java_28_HarmonicNumbers_1 {
    public static void main(String[] args) {
        double enterNumber, harmonicNumber = 0, number = 1, total = 0, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        enterNumber = input.nextInt();

        for (int i = 1; i <= enterNumber; i++) {
            result += (1.0 /i);
        }
        System.out.println("Harmonic Number is : " + result);
    }
}
