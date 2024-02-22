import java.util.Scanner;

public class Java_21_Loops {
    public static void main(String[] args) {

        int number, total = 0, i = 0;
        boolean isZero = false;
        double average;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter Number : ");
            number = input.nextInt();
            if (number != 0){
                if (((number % 3 == 0) || (number % 4 == 0))){
                    i++; // Calculates how many times the loop runs.
                    total = total + number;
                }
                isZero = true;
            }else {
                isZero = false;
            }
        }while (isZero);

        average = (double) total / i;
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);

    }
}
