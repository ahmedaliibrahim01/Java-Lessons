import java.util.Scanner;

public class Java_15_SuggestingActivitiesAccordingToAirTemperature {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Temperature : ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.println("You can ski.");
        } else if (heat < 25) {
            if (heat > 10){
                System.out.println("You can go picnic.");
            }
            if (heat < 15){
                System.out.println("You can go to the cinema.");
            }
        } else {
            System.out.println("You can go swimming");
        }
    }
}
