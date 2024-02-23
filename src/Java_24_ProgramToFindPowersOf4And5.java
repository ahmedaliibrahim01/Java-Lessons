import java.util.Scanner;

public class Java_24_ProgramToFindPowersOf4And5 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        n = input.nextInt();


        for (int i = 1; i <= n; i*=4) {
            System.out.println("Power of 4 is : " + i);
        }


        for (int i = 1; i <= n; i*=5) {
            System.out.println("Power of 5 is : " + i);
        }
    }
}
