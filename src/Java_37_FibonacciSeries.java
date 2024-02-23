import java.util.Scanner;

public class Java_37_FibonacciSeries {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 ......
        Scanner input = new Scanner(System.in);
        int number, total, firstNumber = 0, secondNumber = 1;
        number = input.nextInt();

        System.out.print(number + " Element Fibonacci Series : ");

        for (int i = 1; i <= number; i++) {
            System.out.print(firstNumber + " ");
            total = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = total;
        }
    }
}
