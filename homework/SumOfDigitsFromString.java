package week1.day2.homework;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		String t1=text.replaceAll("[^0-9]", "");
		System.out.println(t1);
		System.out.println("Method1__________________");
		//Method 1
		char[] c1=t1.toCharArray();
		int sum=0;
		for(int i=0;i<c1.length;i++) {
			 sum=sum + Character.getNumericValue(c1[i]);
		}
		System.out.println("The value of sum is:"+sum);
		
		//Method 2
		System.out.println("Method2__________________");
		char[] g1=t1.toCharArray();
		for(int k=0;k<g1.length;k++) {
			if(Character.isDigit(g1[k])) {
				 sum=sum+Character.getNumericValue(g1[k]);
			}
			System.out.println("The value of sum is:"+sum);
		}
	}

}
