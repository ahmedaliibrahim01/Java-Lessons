import java.util.Scanner;

public class Java_17_ZodiacSignFinderProgram {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);

        System.out.print("Birth month : ");
        month = input.nextInt();
        
        if ((month < 1) || (month > 12)){
            System.out.println("You entered the wrong month, please try again.");
        }else {
            System.out.print("Birth day : ");
            day = input.nextInt();

            if ((day <= 0 ) || (day > 31)){
                System.out.println("You entered the wrong day, please try again.");
            }else {
                if (month == 1) {
                    if (day <= 19) {
                        System.out.println("Your Zodiac Sign is Capricorn");
                    }else {
                        System.out.println("Your Zodiac Sign is Aquarius");
                    }
                }else if (month == 2) {
                    if (day <= 18) {
                        System.out.println("Your Zodiac Sign is Aquarius");
                    } else {
                        System.out.println("Your Zodiac Sign is Pisces");
                    }
                }else if (month == 3) {
                    if (day <= 20) {
                        System.out.println("Your Zodiac Sign is Pisces");
                    } else {
                        System.out.println("Your Zodiac Sign is Aries");
                    }
                }else if (month == 4) {
                    if (day <= 19) {
                        System.out.println("Your Zodiac Sign is Aries");
                    }else if (day <= 30) {
                        System.out.println("Your Zodiac Sign is Taurus");
                    }else {
                        System.out.println("You entered the wrong day, please try again.");
                    }
                }else if (month == 5) {
                    if (day <= 20) {
                        System.out.println("Your Zodiac Sign is Taurus");
                    } else {
                        System.out.println("Your Zodiac Sign is Gemini");
                    }
                }else if (month == 6) {
                    if (day <= 20) {
                        System.out.println("Your Zodiac Sign is Gemini");
                    }else if(day <= 30){
                        System.out.println("Your Zodiac Sign is Cancer");
                    }else {
                        System.out.println("You entered the wrong day, please try again.");
                    }
                }else if (month == 7) {
                    if (day <= 22) {
                        System.out.println("Your Zodiac Sign is Cancer");
                    } else {
                        System.out.println("Your Zodiac Sign is Leo");
                    }
                }else if (month == 8) {
                    if (day <= 22) {
                        System.out.println("Your Zodiac Sign is Leo");
                    }else {
                        System.out.println("Your Zodiac Sign is Virgo");
                    }
                }else if (month == 9) {
                    if (day <= 22) {
                        System.out.println("Your Zodiac Sign is Virgo");
                    } else if (day <= 30){
                        System.out.println("Your Zodiac Sign is Libra");
                    }else {
                        System.out.println("You entered the wrong day, please try again.");
                    }
                }else if (month == 10) {
                    if (day <= 22) {
                        System.out.println("Your Zodiac Sign is Libra");
                    } else {
                        System.out.println("Your Zodiac Sign is Scorpio");
                    }
                }else if (month == 11) {
                    if (day <= 21) {
                        System.out.println("Your Zodiac Sign is Scorpio");
                    } else if (day <= 30){
                        System.out.println("Your Zodiac Sign is Sagittarius");
                    }else {
                        System.out.println("You entered the wrong day, please try again.");
                    }
                }else {
                    if (day <= 21) {
                        System.out.println("Your Zodiac Sign is Sagittarius");
                    } else {
                        System.out.println("Your Zodiac Sign is Capricorn ");
                    }
                }
            }

        }

    }
}
