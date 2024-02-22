import java.util.Scanner;

public class Java_22_SumOfOddNumbers {
    public static void main(String[] args) {
        int number, total = 0, i = 0;
        boolean isZero = false;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter Number : ");
            number = input.nextInt();
            if (number > -1 ){
                if (number % 2 != 0){
                    i++; // Calculates how many times the loop runs.
                    total = total + number;
                }
                isZero = true;
            }else {
                isZero = false;
            }
        }while (isZero);

        System.out.println("Total : " + total);

    }
}
