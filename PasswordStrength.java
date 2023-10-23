import java.util.Scanner;
public class PasswordStrength 
{
	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your password : ");
       		String password = scanner.nextLine();
		int len = password.length();
        	boolean hasUpper = !password.equals(password.toLowerCase());
        	boolean hasLower = !password.equals(password.toUpperCase());
        	boolean hasDigit = password.matches(".*\\d.*");
        	boolean hasSpecialChar = !password.matches("[a-zA-Z0-9]*");
		if (len > 8 && hasUpper && hasLower && hasDigit && hasSpecialChar) 
		{
            		System.out.println("\n\n\t\t\t Password strength: Strong");
			System.out.println("It's great, The Password looks  fine");
        	} 
		else if (len > 8 )
		{
			System.out.println("The length of your passcode seems to be fine but make sure that it consists of Special characters, Digits and different Case alphabets"); 
			System.out.println("To make your password stronger, include Special characters, Digits and different Case alphabets ");
		}
		else if (len > 6 && len <= 8 && (hasUpper || hasLower || hasDigit || hasSpecialChar)) 
		{
            		System.out.println("\n\n\t\t\t Password strength: Medium");
			System.out.println("The Password with better strength is suggestable, Try incresing the length of your password");    
        	} 
		else if (len <= 5)
		{
            		System.out.println("\n\n\t\t\t Password strength: Weak");
			System.out.println("Try Including change of the case or Digits or Special characters to your Password and increase it's length to make your password stonger");
        	}
    	}
}		
