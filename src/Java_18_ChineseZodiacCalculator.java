import java.util.Scanner;

public class Java_18_ChineseZodiacCalculator {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Birth Year : ");
        year = input.nextInt();

        if (year%12 == 0){
            System.out.println("Your Chinese Zodiac Sign : Monkey");
        }else if (year%12 == 1){
            System.out.println("Your Chinese Zodiac Sign : Cockerel");
        } else if (year%12 == 2){
            System.out.println("Your Chinese Zodiac Sign : Dog");
        }else if (year%12 == 3){
            System.out.println("Your Chinese Zodiac Sign : Pig");
        }else if (year%12 == 4){
            System.out.println("Your Chinese Zodiac Sign : Mouse");
        }else if (year%12 == 5){
            System.out.println("Your Chinese Zodiac Sign : Ox");
        }else if (year%12 == 6){
            System.out.println("Your Chinese Zodiac Sign : Kaplan");
        }else if (year%12 == 7){
            System.out.println("Your Chinese Zodiac Sign : Rabbit");
        }else if (year%12 == 8){
            System.out.println("Your Chinese Zodiac Sign : Dragon");
        }else if (year%12 == 9){
            System.out.println("Your Chinese Zodiac Sign : Snake");
        }else if (year%12 == 10){
            System.out.println("Your Chinese Zodiac Sign : Horse");
        }else if (year%12 == 11){
            System.out.println("Your Chinese Zodiac Sign : Sheep");
        }else {
            System.out.println("You entered wrong data");
        }

    }
}
