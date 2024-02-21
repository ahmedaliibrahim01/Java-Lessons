import java.util.Scanner;

public class Java_12_Calculator {
    public static void main(String[] args) {
        int number1, number2, select, result;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        number1 = input.nextInt();
        System.out.print("Enter Number 2 : ");
        number2 = input.nextInt();
        System.out.println("1- Addition\n2- Subtraction\n3- Multiplication\n4- Division");
        System.out.print("Select : ");
        select = input.nextInt();

        switch (select) {
            case  1:
                result = number1 + number2;
                System.out.println("Total : " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("Subtraction : " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("Multiplication : " + result);
                break;
            case 4:
                if (number2 != 0){
                    result = number1 / number2;
                    System.out.println("Division : " + result);
                }else {
                    System.out.println("A number cannot be divided by 0");
                }
                break;
            default:
                System.out.println("You made the wrong choice, please try again.");
                break;
        }
    }
}
