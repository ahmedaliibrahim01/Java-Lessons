import java.util.Scanner;

public class Java_13_UserLogin {
    public static void main(String[] args) {
        String userName, password, passwordReset;
        int select;
        Scanner input = new Scanner(System.in);

        System.out.print("Username : ");
        userName = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();

        if (userName.equals("Java") && password.equals("Java")){
            System.out.println("Login successful");
        } else if (!password.equals("Java")){
            System.out.println("Login failed !");
            System.out.println("Şifreni yenilemek ister misin? Evet içi : 1 yaz, Hayır için 2 ");
            select = input.nextInt();
            if (select == 1) {
                input.nextLine();
                System.out.print("Lütfen yeni şifrenizi giriniz : ");
                passwordReset = input.nextLine();
                if (passwordReset.equals("Java") || (passwordReset.equals(password))){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Güle güle");
            }
        }else {
            System.out.println("Login failed !");
        }
    }
}
