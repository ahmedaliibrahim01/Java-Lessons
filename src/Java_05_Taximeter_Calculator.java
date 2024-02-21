import java.util.Scanner;
public class Java_05_Taximeter_Calculator {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, startPrice = 10, minimumPayment = 20, total;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance: ");
        km = input.nextInt();
        total = startPrice + km * perKm;
        total = (total < 20) ? minimumPayment : total;
        System.out.println(total);
    }
}
