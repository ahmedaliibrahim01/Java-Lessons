import java.util.Scanner;

public class Java_19_LeapYear {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your year : ");
        year = input.nextInt();

        if (( year % 400 == 0) || (( year % 4 == 0 ) && ( year % 100 != 0))){
            System.out.println("Leap");
        }else {
            System.out.println("Not leap");
        }
    }
}
