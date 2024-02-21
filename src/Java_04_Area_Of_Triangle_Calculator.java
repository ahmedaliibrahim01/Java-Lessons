import java.util.Scanner;
public class Java_04_Area_Of_Triangle_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, u;
        double area;

        System.out.println("Enter perimeter information to find the area of the triangle");
        System.out.println("Enter number a : ");
        a = input.nextInt();
        System.out.println("Enter number b : ");
        b = input.nextInt();
        System.out.println("Enter number c : ");
        c = input.nextInt();

        u = (a+b+c) / 2;
        area = u * ( u - a) * (u - b) * (u - c);
        area = Math.sqrt(area);
        System.out.println("Area of triangle is : " + area);

    }
}
