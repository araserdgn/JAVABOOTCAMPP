package projeAsal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=-6;
		int remainder = number %2;
		boolean isPrime=true;
		
		if(number==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		if(number<2) {
			System.out.println("Gecersiz sayı girdiniz");
		}
		
		for(int i=2;i<number;i++) {
			if(number % i==0) {
				isPrime=false;
			}
		}
		
		if(isPrime) {
			System.out.println("SAyı asaldır");
		}
		else {
			System.out.println("sayı asal değildir.");
		}

	}

}
