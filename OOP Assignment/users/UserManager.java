package users;

public class UserManager {
    private static final String storedUsername = "abcxyz";
    private static final String storedPassword = "a123";


    public static class LoginProcessor {
        public static boolean authenticate(String username, String password) {
            return storedUsername.equals(username) && storedPassword.equals(password);
        }
    }
}