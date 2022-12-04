package week1.day2.homework;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] s1=text.split(" ");
		for(int i=0;i<s1.length;i++) {
			//System.out.println(s1[i]);
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i].equals(s1[j]))
				{
					s1[i]=s1[i].replace(s1[i], "");
				}
			}
		}
		for(int k=0;k<s1.length;k++) {
			System.out.print(s1[k]+" ");
		}
	}

}
