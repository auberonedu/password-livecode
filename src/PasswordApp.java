import java.util.Scanner;

public class PasswordApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the password checker!");

        System.out.print("Please enter your password: ");

        String password = scan.nextLine();

        System.out.println("The password is: " + password);

        if (password.length() < 12){
            System.out.println("Password length is too short.");
        } else {
            System.out.println("Your password is a good length.");
        }
    }
}