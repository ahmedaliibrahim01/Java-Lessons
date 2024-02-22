import java.util.Scanner;

public class Java_16_SortingNumbersFromSmallestToLargest {
    public static void main(String[] args) {
        int numberA, numberB, numberC;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number A : ");
        numberA = input.nextInt();
        System.out.print("Enter Number B : ");
        numberB = input.nextInt();
        System.out.print("Enter Number C : ");
        numberC = input.nextInt();

        if ((numberA < numberB) && (numberA < numberC)) {
            if (numberB < numberC) {
                System.out.println("A < B < C");
            } else {
                System.out.println("A < C < B");
            }
        } else if ((numberB < numberA) && (numberB < numberC)) {
            if (numberA < numberC) {
                System.out.println("B < A < C");
            } else {
                System.out.println("B < C < A");
            }
        } else {
            if (numberB < numberA) {
                System.out.println("C < B < A");
            } else {
                System.out.println("C < A < B");
            }
        }

    }
}