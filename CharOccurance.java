package week1.day2.Assignment3;

public class CharOccurance {
	private static int i;

	public static void main(String[] args) {
		char name = 'n';
		String str2 = "welcome to chennai";
	    int count = 0;
	    char[] str3 = str2 .toCharArray();
	    for(int i = 0;i < str2.length();i++) {
	    	if(name == str3[i]) {
	    		count ++;
	    	}
	    }
	    
	    System.out.println("the character  "  + name +  "occurance is" +  count);
	    
	    		
	}

}