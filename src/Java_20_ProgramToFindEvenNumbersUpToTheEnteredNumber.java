import java.util.Scanner;

public class Java_20_ProgramToFindEvenNumbersUpToTheEnteredNumber {
    public static void main(String[] args) {
        int number, total=0;
        boolean isZero = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }
        }

        }
    }