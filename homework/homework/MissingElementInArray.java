package week1.day2.homework;

import java.util.Arrays;

import org.apache.poi.util.SystemOutLogger;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,7,6,8};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			//System.out.println(i+ " "+arr[i]);
			
			if(i+1==arr[i]) {
				continue;
			}
			else {
				System.out.println(i+1);
				break;
			}
		}

	}

}
