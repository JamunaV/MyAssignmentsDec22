package week1.day1.homework;

public class IsPrime {
	
	public void checkPrime(int n) {
		
		for(int i=2;i<=n-1;i++) {
			if(n%2==0) {
				System.out.println("Not  a prime number!!!!!");
			}else
				System.out.println("It is a prime number!!!!!!");
			
		}
		System.out.println("Methos Executed");
	}

	public static void main(String[] args) {
		IsPrime p=new IsPrime();
		p.checkPrime(2);
		
	}

}
