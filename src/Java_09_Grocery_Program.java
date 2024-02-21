import java.util.Scanner;

public class Java_09_Grocery_Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pear = 3.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5.00, kg, total;
        System.out.print("How Many Kilos of Pears? : ");
        kg = input.nextDouble();
        pear *= kg;
        System.out.print("How Many Kilos of Apple? : ");
        kg = input.nextDouble();
        apple *= kg;
        System.out.print("How Many Kilos of Tomato? : ");
        kg = input.nextDouble();
        tomato *= kg;
        System.out.print("How Many Kilos of Banana? : ");
        kg = input.nextDouble();
        banana *= kg;
        System.out.print("How Many Kilos of Eggplant? : ");
        kg = input.nextDouble();
        eggplant *= kg;

        total = (pear + apple + tomato + banana + eggplant);
        System.out.println("Total Amount : " + total + " TL");
    }
}
