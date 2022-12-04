package week1.day2.homework;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";//ChAnGeMe
		char[] t1=test.toCharArray();
		System.out.println(t1);
		for(int i=0;i<=t1.length-1;i++) {
			if(i%2==0) {

				System.out.print(Character.toUpperCase(t1[i]));
			}
			else
				System.out.print(t1[i]);
		}

	}

}
