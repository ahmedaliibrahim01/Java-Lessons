import java.util.Scanner;

public class Java_30_EBOB_EKOK_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, ebob=1;
        System.out.print("Enter number N1: " );
        n1 = input.nextInt();

        System.out.print("Enter number N2: ");
        n2 = input.nextInt();

        for (int k = n1; k >= 1; k--){
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                break;
            }
        }

        for (int i = 1; i <= (n1 * n2) ; i++) {
            if (i % n1 == 0 && i % n2 == 0){
                System.out.println(i);
                break;
            }
        }
        System.out.println((n1*n2) / ebob);
    }

}
