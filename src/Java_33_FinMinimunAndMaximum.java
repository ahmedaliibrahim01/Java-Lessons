import java.util.Scanner;

public class Java_33_FinMinimunAndMaximum {
    public static void main(String[] args) {

        int n, number, min, max;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        System.out.print("Ilk Sayıyı giriniz: ");
        min = input.nextInt();
        max = min;


        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            number = input.nextInt();

            if (number < min){
                min = number;
            } else if (number > max) {
                max = number;
            }
        }
        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
    }
}
