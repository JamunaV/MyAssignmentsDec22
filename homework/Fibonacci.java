package week1.day1.homework;

public class Fibonacci {

	public void printFib(int n) {
		int n1=0,n2=1,sum=0;
		 
		System.out.print(n1+ " ");
		System.out.print(n2+ " ");
		for(int i=0; i<11;i++)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(sum + " ");
		}

	}

	public static void main(String[] args) {
		Fibonacci fb=new Fibonacci();
		fb.printFib(11);
	}

}
