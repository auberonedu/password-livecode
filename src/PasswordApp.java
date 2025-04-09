// javac ....the file name of your Java source code file && java -cp src ..javaname... to print in the terminal
// add < ...file name... > in your terminal to compile your Java file and then run it with the command java -cp src Main

import java.util.Scanner; // Import the Scanner class to use Scanner
public class PasswordApp {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the password checker!");
    
        // Read user input until there is no more input
        while(scanner.hasNextLine()){ 

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

            // toCharArray() method is used to convert a string into a character array. 
            char [] characters = password.toCharArray(); 

            boolean hasSpecialChar = false; // Flag to check if the password has a special character

            // Using a for loop to iterate over each character in the array
            for (int i =0; i < characters.length; i++) {
                char character = characters[i]; // Get the current character from the array
                // System.out.println(Character.isAlphabetic(character)); // Check if the character is alphabetic, true if it is, false otherwise
                
                // Check if the character is not alphabetic (not a letter)
                if(Character.isAlphabetic(character) == false){
                    hasSpecialChar = true;
                }
            }

            System.out.println("Has a special character: " + hasSpecialChar);
        }






        //Scanner needs to be closed to free up resources
        scanner.close();
    
    }
}