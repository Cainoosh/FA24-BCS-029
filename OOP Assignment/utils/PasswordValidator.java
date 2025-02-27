package utils;
import users.UserManager;
public class PasswordValidator{

	public class Rules{
		Boolean isValid(String password){
			if (password!=null){
				return true;}
			else{
				return false;
			}
		}
	}


}