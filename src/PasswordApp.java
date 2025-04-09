// javac ....the file name of your Java source code file && java -cp src ..javaname... to print in the terminal
import java.util.Scanner; // Import the Scanner class to use Scanner
public class PasswordApp {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the password checker!");
    
        // Read the password from the user input
        String password = scanner.nextLine(); 


        System.out.println("The password is: " + (password));
        
        //To find the length of the password
        //password.length()
        if(password.length() >= 12){
            System.out.println("Your password is long enough.");
        }else{
            System.out.println("Your password is not long enough.");
        } 

        //Scanner needs to be closed to free up resources
        scanner.close();
    
    }
}