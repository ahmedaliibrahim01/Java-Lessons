import java.util.Scanner;
public class Java_27_ArmstrongNumber_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, basNumber, total = 0;
        System.out.print("Enter Number : ");
        number = input.nextInt();

        while (number != 0){
            basNumber = number % 10;
            total = total + basNumber;
            number = number / 10;
        }
        System.out.println("Sum of digits of the number : " + total);
    }
}
