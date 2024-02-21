import java.util.Scanner;

public class Java_11_FlightTicketPriceCalculation {
    public static void main(String[] args) {

        int age, tripType;
        double km, perKm = 0.10, normalPrice, discountRate10 = 0.10, backRate = 0.20, discountRate30 = 0.30, discountRate50 = 0.50, finalPrice;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in km: ");
        km = input.nextDouble();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter the trip type (1 => One Way, 2 => Round Trip ): ");
        tripType = input.nextInt();

        normalPrice = km * perKm;

        if ((tripType <= 0) || (tripType > 2)) {
            System.out.println("You Entered Incorrect Data !");
        } else if (age < 12) {
            finalPrice = normalPrice - (normalPrice * discountRate50);
            if (tripType == 2) {
                finalPrice = 2 * (finalPrice - (finalPrice * backRate));
                System.out.println("Total Amount = " + finalPrice + " TL");
            } else {
                System.out.println("Total Amount = " + finalPrice + " TL");
            }
        } else if ((age > 12) && (age <= 24)) {
            finalPrice = normalPrice - (normalPrice * discountRate10);
            if (tripType == 2) {
                finalPrice = 2 * (finalPrice - (finalPrice * backRate));
                System.out.println("Total Amount = " + finalPrice + " TL");
            } else {
                System.out.println("Total Amount = " + finalPrice + " TL");
            }
        } else if (age > 65) {
            finalPrice = normalPrice - (normalPrice * discountRate30);
            if (tripType == 2) {
                finalPrice = 2 * (finalPrice - (finalPrice * backRate));
                System.out.println("Total Amount = " + finalPrice + " TL");
            } else {
                System.out.println("Total Amount = " + finalPrice + " TL");
            }
        } else {
            System.out.println("Total Amount = " + normalPrice + " TL");
        }
    }
}
