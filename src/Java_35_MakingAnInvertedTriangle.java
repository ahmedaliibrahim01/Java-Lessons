import java.util.Scanner;

public class Java_35_MakingAnInvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("*");
            }
            System.out.println("*");

        }
    }

}
