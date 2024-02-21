import java.util.Scanner;
public class Java_07_Area_of_Circle_Section {
    public static void main(String[] args) {

        double pi = 3.14, circleSection;
        int r, a;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        r = input.nextInt();
        System.out.print("Enter the measure of the center angle of the circle: ");
        a = input.nextInt();
        circleSection = (pi * (r*r) * a) / 360;
        System.out.println("Area : " + circleSection);

    }
}
