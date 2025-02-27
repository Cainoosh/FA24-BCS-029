package main;
import users.UserManager;
import java.io.Console;

public class LoginSystem {
    public static void main(String[] args) {
        Console cs = System.console();


        System.out.print("Enter Username: ");
        String username = cs.readLine();

        System.out.print("Enter Password: ");
        char[] passwordC = cs.readPassword();
	String password = new String(passwordC);


        if (UserManager.LoginProcessor.authenticate(username, password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}