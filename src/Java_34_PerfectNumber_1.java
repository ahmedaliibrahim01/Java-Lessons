import java.util.Scanner;

public class Java_34_PerfectNumber_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 2, p, atotal = 1, btotal = 1,temp, perfectNumber;
        System.out.print("Enter Number P : ");
        p = input.nextInt();
        temp = p - 1;

        for (int i = 1; i <= temp; i++) {
            atotal = atotal *number;
        }

        for (int i = 1; i <= p; i++) {
            btotal = btotal*number;
        }

        btotal = btotal - 1;
        perfectNumber = atotal * btotal;

        System.out.println("Perfect Number is : " + perfectNumber);
    }
}
