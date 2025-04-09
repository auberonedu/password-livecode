import java.util.Scanner;

public class PasswordApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the password checker!");

        while(scan.hasNextLine()) {
            String password = scan.nextLine();

            System.out.println("The password is: " + password);

            if(password.length() >= 12) {
                System.out.println("Your password is a good length!");
            } else {
                System.out.println("Your password is too short");
            }

            char[] characters = password.toCharArray();

            boolean hasSpecial = false;

            for(int i = 0; i < characters.length; i++) {
                char character = characters[i];
                if(Character.isAlphabetic(character) == false) {
                    hasSpecial = true;
                }
            }

            System.out.println("Has a special character " + hasSpecial);
        }
    }
}