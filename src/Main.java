import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        number = input.nextInt();
        if (number % 4 == 0) {
            System.out.println("dört kat");
        }else {
            System.out.println("değil");
        }
    }
}