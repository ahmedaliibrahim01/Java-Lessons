import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number, us, total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        number = input.nextInt();
        System.out.print("Enter Numner : ");
        us = input.nextInt();

        for (int i = 1; i <= us; i++) {
            total = total*number;
            System.out.println(i);
        }

        System.out.println(total);
        
    }

}