package Strings;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//from last to first
				String s = "420";
				String res = "";
				for(int i = s.length()-1;i>=0;i--) {
					res = res+s.charAt(i);
				}
				System.out.println(res);
				
				//from first to last
				String s1 = "1000";
				String res1 = "";
				for(int i =0; i<s1.length();i++) {
					res1 = s1.charAt(i) + res1;
				}
				System.out.println(res1);

			}

}
