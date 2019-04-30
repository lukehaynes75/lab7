package labnum7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class validatingthings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your phone number in the format of xxx-xxx-xxxx");
		String phoneNum = scan.next();
		boolean phoneVal = phoneNumVal(phoneNum);
		if(phoneVal == true) {
			System.out.println("Valid Phone Number");
		}else {
			System.out.println("Not a valid phone number");
		}
		
		System.out.println("Please enter a date in the format of xx/xx/xxxx");
		String date = scan.next();
		boolean dateCheck = dateChecker(date);
		if(dateCheck == true) {
			System.out.println("Valid date");
		} else {
			System.out.println("invalid date");
		}
		
	}
	
	public static boolean phoneNumVal(String num) {
		boolean testPhone = Pattern.matches("\\d{3}-\\d{3}-\\d{4}", num);
		
		if(testPhone == true) {
		return true;}
		else {
			return false;
		}
		
	}
	public static boolean dateChecker(String num) {
		boolean dateTest = Pattern.matches("^(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\\\d\\\\d$", num);
		if(dateTest == true) {
			return true;
		}else {
			return false;
		}
	}
	
}
