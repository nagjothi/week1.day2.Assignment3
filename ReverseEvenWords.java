package week1.day2.Assignment3;

public class ReverseEvenWords {
public static void main(String[] args) {
	String test = "I am a software tester";
	String[] txt1 = test.split(" ");
	for (int i = 0; i < txt1.length; i++) {
		if(i%2!=0)
		{
			String str = txt1[i];
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
			
		}
	}
}
}