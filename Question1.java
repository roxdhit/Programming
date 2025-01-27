package Strings;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int vowelsCount=0;
		int consonantCount=0;
		int spaceCount = 0;
		String s ="pEnt  agon";
		String s1 = s.toLowerCase();
		for(int i=0; i<s1.length();i++) {
			char ch = s1.charAt(i);//character at particular index
			if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') {
				vowelsCount++;
			}
			else if(ch == 32) {
				spaceCount++;
			}
			else {
				consonantCount++;
			}
		}
		System.out.println(vowelsCount);
		System.out.println(consonantCount);
		System.out.println(spaceCount);
	}

}
