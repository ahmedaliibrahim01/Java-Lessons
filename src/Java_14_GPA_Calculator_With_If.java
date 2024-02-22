import java.util.Scanner;

public class Java_14_GPA_Calculator_With_If {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int math, physics, chemistry, turkish, history, music, sum;
        double average;

        System.out.print("Your math score: ");
        math = input.nextInt();
        math = (math<0) || (math>100) ? 0 : math;
        System.out.print("Your physics score: ");
        physics = input.nextInt();
        physics = (physics<0) || (physics>100) ? 0 : physics;
        System.out.print("Your chemistry score: ");
        chemistry = input.nextInt();
        chemistry = (chemistry<0) || (chemistry>100) ? 0 : chemistry;
        System.out.print("Your turkish score: ");
        turkish = input.nextInt();
        turkish = (turkish<0) || (turkish>100) ? 0 : turkish;
        System.out.print("Your history score: ");
        history = input.nextInt();
        history = (history<0) || (history>100) ? 0 : history;
        System.out.print("Your music score: ");
        music = input.nextInt();
        music = (music<0) || (music>100) ? 0 : music;

        sum = (math + physics + chemistry + turkish + history + music);
        average = sum / 6.0;
        System.out.println("Your average score: " + average);
        if (average >= 55){
            System.out.println("You passed the exam");
        }else {
            System.out.println("You failed the exam");
        }
    }
}
