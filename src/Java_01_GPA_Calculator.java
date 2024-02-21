import java.util.Scanner;

public class Java_01_GPA_Calculator {
    public static void main(String[] args) {
        int math, physics, chemistry, turkish, history, music, sum;
        double average;
        String passingStatus;

        Scanner input = new Scanner(System.in);

        System.out.print("Your math score: ");
        math = input.nextInt();
        System.out.print("Your physics score: ");
        physics = input.nextInt();
        System.out.print("Your chemistry score: ");
        chemistry = input.nextInt();
        System.out.print("Your turkish score: ");
        turkish = input.nextInt();
        System.out.print("Your history score: ");
        history = input.nextInt();
        System.out.print("Your music score: ");
        music = input.nextInt();

        sum = (math + physics + chemistry + turkish + history + music);
        average = sum / 6.0;
        System.out.println("Your average score: " + average);
        passingStatus = average > 60 ? "You passed the exam" : "You failed the exam";
        System.out.println(passingStatus);
    }
}
