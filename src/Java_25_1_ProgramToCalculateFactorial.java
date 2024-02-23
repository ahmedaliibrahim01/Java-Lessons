import java.util.Scanner;

public class Java_25_1_ProgramToCalculateFactorial {
    public static void main(String[] args) {
        int n, total = 1, fak;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            total = total*i;
            System.out.println(total);
        }
    }
}
