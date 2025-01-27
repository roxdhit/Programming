package Strings;
import java.util.*;
public class VowelsPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			int vowelsCount=0;
			int consonantCount=0;
			String s ="pentagon";
			for(int i=0; i<s.length();i++) {
				char ch = s.charAt(i);//character at particular index
				if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') {
					vowelsCount++;
				}
				else {
					consonantCount++;
				}
			}
			System.out.println(vowelsCount);
			System.out.println(consonantCount);

		}

	}
	