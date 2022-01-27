package week1.day2.Assignment3;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String text1 = "stops";
	String text2  = "postss";
	
	if(text1.length() == text2.length()) {
		char[] chararr1 = text1.toCharArray();
		char[] chararr2 = text2.toCharArray();
	}
	long[] chararr1 = null;
	long[] chararr2 = null;
	boolean result = Arrays.equals(chararr1, chararr2);
	if(result) {
		System.out.println("it is Anagram");
	
	}
	else {
		System.out.println("it is not Anagram");
		
	}
			
}


}
