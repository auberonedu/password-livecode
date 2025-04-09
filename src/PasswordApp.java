import java.util.Scanner;
public class PasswordApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the password checker!");

        while(scan.hasNextLine()) {
            String password = scan.nextLine(); //scans user input

            System.out.println("The password is: " + password);

            if(password.length() >= 12) {
                System.out.println("Password met characterized length");
            }else {
                    System.out.println("Password has not met requirement(s)");
                }

                char[] characters = password.toCharArray();

                boolean hasSpecial = false; //scans user input if it has numerical value

                for (int i=0; i< characters.length; i++) {
                    char character = characters[i];
                    System.out.println(Character.isAlphabetic(character) == false); {
                        hasSpecial = true;
                    }
                }
                System.out.println("Has a special character" + hasSpecial);
            }
        }
    }
    
