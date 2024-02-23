import java.util.Scanner;

public class Java_25_2_CombinationCalculator {
    public static void main(String[] args) {
        int n, ntotal = 1, r, rtotal = 1, nr, nrtotal = 1, c;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter N : ");
        n = input.nextInt();
        System.out.print("Enter R : ");
        r = input.nextInt();
        nr = n-r;
        // N Factorial
        for (int i = 1; i <= n; i++) {
            ntotal = ntotal*i;
        }
        System.out.println("N Factorial is : " + ntotal);
        // R Factorial
        for (int i = 1; i <= r; i++) {
            rtotal = rtotal*i;
        }
        System.out.println("R Factorial is : " + rtotal);
        // N-R Factorial
        for (int i = 1; i <= nr; i++) {
            nrtotal = nrtotal*i;
        }
        System.out.println("N-R Factorial is : " + nrtotal);

        c = ntotal / (rtotal * nrtotal);
        System.out.println("Combination is : "+c);
    }
}
