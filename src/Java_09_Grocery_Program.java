import java.util.Scanner;

public class Java_09_Grocery_Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 3.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, kg, total;
        System.out.print("Armut Kaç Kilo ? : ");
        kg = input.nextDouble();
        armut *= kg;
        System.out.print("Elma Kaç Kilo ? : ");
        kg = input.nextDouble();
        elma *= kg;
        System.out.print("Domates Kaç Kilo ? : ");
        kg = input.nextDouble();
        domates *= kg;
        System.out.print("Muz Kaç Kilo ? : ");
        kg = input.nextDouble();
        muz *= kg;
        System.out.print("Patlican Kaç Kilo ? : ");
        kg = input.nextDouble();
        patlican *= kg;

        total = (armut + elma + domates + muz + patlican);
        System.out.println("Toplam Tutar : " + total + " TL");
    }
}
