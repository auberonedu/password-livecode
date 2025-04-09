import java.util.Scanner;
public class PasswordApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the password checker!");

        String password = scan.nextLine(); //scans user input

        System.out.println("The password is: " + password);

        if(password.length() >= 12) {
            System.out.println("Password met characterized length");
        }else {
                System.out.println("Password has not met requirement(s)");
            }
        }
    }
