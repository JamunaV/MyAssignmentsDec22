package week1.day2.homework;

import org.apache.poi.util.SystemOutLogger;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] s1=test.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			//System.out.println(s1[i]);
			if(!(i%2==0)) {
				char[] c1=s1[i].toCharArray();
	
				for(int j=c1.length-1;j>=0;j--) {
					System.out.print(c1[j]);
					
				}
			}
			else
			{
				System.out.print(" "+s1[i]+" ");
			}
		}
		
		

	}

}
