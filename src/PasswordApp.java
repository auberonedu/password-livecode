
import java.util.Scanner;

public class PasswordApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the password checker!");

        while(scan.hasNext()){

            String password = scan.nextLine();
            System.out.println("The password is: " + password);

            if (password.length()>= 12){
                System.out.println("Your Password is a good length!");
            } else{
                System.out.println("Your password is to short!!!");
            }
            char[] characters = password.toCharArray();

            boolean hasSpeacial = false;

            for(int i =0; i < characters.length; i++){
                char character = characters[i];
                if (Character.isAlphabetic(character) == false){
                    hasSpeacial = true;
                }
            }
            System.out.println("Has a special Character " + hasSpeacial);
        }
    }
}