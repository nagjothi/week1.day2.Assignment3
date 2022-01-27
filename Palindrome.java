package week1.day2.Assignment3;

public class Palindrome {
@SuppressWarnings("null")
public static void main(String[] args) {
	String value = "madam", rev = "";
	int length = value.length();
	for(int i = length - 1;i >= 0;i--) {
	rev = rev + value.charAt(i);
			}
	if(value.equals(rev)) {
		System.out.println("it is palindrome");
	}
	else {
	    System.out.println("it is not palindrome");
	}
	
			
}
}
