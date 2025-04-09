
import java.util.Scanner;

public class PasswordApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the password checker!");

        String password = scanner.nextLine();

        System.out.println("The password is: " + password);

        if(password.length() >= 12){
            System.out.println("your password is a good length");
        } else {
            System.err.println("Your password is too short");
        }
    }
}