import java.util.Scanner;
public class Java_08_Calculator_of_Body_Mass_Index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kg, height, index;
        System.out.print("Enter your Height : ");
        height = input.nextDouble();
        System.out.print("Enter your KG : ");
        kg = input.nextDouble();

        index = kg / (height * height);
        System.out.println(index);
    }
}
