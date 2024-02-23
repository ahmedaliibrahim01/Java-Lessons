import java.util.Scanner;

public class Java_24_ProgramToFindPowersOf2 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i*=2) {
            System.out.println("Your number is : " + i);
        }
    }
}
