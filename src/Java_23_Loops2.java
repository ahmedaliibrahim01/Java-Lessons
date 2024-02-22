import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Java_23_Loops2 {
    public static void main(String[] args) {
        int number, total = 0, i = 0;
        boolean isZero = false;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter Number : ");
            number = input.nextInt();
            if ((number % 2 == 0)){
                if ((number % 2 == 0) && (number % 4 == 0)){
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
