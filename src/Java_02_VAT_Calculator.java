import java.util.Scanner;
public class Java_02_VAT_Calculator {
    public static void main(String[] args) {
        double priceExcludingVat, priceIncludingVat, vatAmount, vatRate;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter fee amount: ");
        priceExcludingVat = input.nextInt();

        vatRate = ((priceExcludingVat >= 0) && (priceExcludingVat <= 1000)) ? 0.18 : 0.08;
        vatAmount = vatRate*priceExcludingVat;
        priceIncludingVat = priceExcludingVat + vatAmount;

        System.out.println("Price Excluding Vat : " + priceExcludingVat);
        System.out.println("Vat Rate : " + vatRate);
        System.out.println("Vat Amount : " + vatAmount);
        System.out.println("Price Including Vat : " + priceIncludingVat);
    }
}
