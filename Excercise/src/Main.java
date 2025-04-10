import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter Your Username: ");
        Scanner loginScanner = new Scanner(System.in);
        String username_from_input = loginScanner.nextLine();

        System.out.println("Enter Your Password: ");
        String password_from_input = loginScanner.nextLine();

        System.out.println("Your username is: " + username_from_input);
        System.out.println("Your password is: " + password_from_input);

        String details = "john,password";
        String[] splitDetails = details.split(",");
        String username = splitDetails[0];  
        String password = splitDetails[1];  

        File myfile = new File("accounts.txt");

        if (myfile.exists()) {
            System.out.println("File exists");

            try (Scanner fileScanner = new Scanner(myfile)) {
                boolean accountFound = false;

                while (fileScanner.hasNextLine()) {
                    String filedata = fileScanner.nextLine();
                    String[] accountDetails = filedata.split(",");
                    String fileUsername = accountDetails[0];
                    String filePassword = accountDetails[1];

                    if (fileUsername.equals(username_from_input) && filePassword.equals(password_from_input)) {
                        System.out.println("Login successful!");
                        accountFound = true;
                        break;
                    }
                }

                if (!accountFound) {
                    System.out.println("Invalid username or password.");
                }
            }
        } else {
            System.out.println("File does not exist.");
        }

        loginScanner.close();
    }
}
