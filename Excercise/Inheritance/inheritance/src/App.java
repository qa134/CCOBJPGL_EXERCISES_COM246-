//class Parent {
//    String surname = "Smith";
//}

//class Daughter extends Parent {
//    String Name;
//
//    public String getSurname() {
//        return surname;
//    }
//}

//public class App {
  //  public static void main(String[] args) {
    //    Daughter mysister = new Daughter();
//
  //      mysister.Name = "Paola";
    //    System.out.println("My name is " + mysister.Name + " " + mysister.getSurname());
    //}
//}


import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Scanner inputscanner = new Scanner(System.in); 
        // System.out.println("Enter username:");

        // String userNameinput = inputscanner.nextLine(); 

        // System.out.println("Enter password:");

        // String passwordinput = inputscanner.nextLine(); 

        // User user = new User(userNameinput, passwordinput);

        // File accountsfile = new File("accounts.txt");

        // if (accountsfile.createNewFile()) {
        //     System.out.println("File created: " + accountsfile.getName());
        // } else {
        //     System.out.println("File already exists.");
        // } 

        // inputscanner.close();

        // Scanner filescanner = new Scanner(accountsfile);
        // while (filescanner.hasNextLine()) {

        //     String data = filescanner.nextLine();
   
        //     String username = data.split(",")[0];
        //     String password = data.split(",")[1];

        //     if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
        //         System.out.println("Login successful");
        //         break;
        //     }
        // }

        // filescanner.close();
        
        // Datascientist object
        DataScientist dataScientist1 = new DataScientist("John", null, null);
        
        System.out.println("My name is " + dataScientist1.name);
        System.out.println("His work is " + dataScientist1.getwork());
        System.out.println("He earns " + dataScientist1.getSalary());

        Researcher researcher1 = new Researcher("Jane", null, null);

        System.out.println("My name is " + researcher1.name);
        System.out.println("Her work is " + researcher1.getwork());
        System.out.println("She earns " + researcher1.getSalary());
        
        
    }
}
