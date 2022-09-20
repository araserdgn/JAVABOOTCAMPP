package mukSayi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=27;
		int total=0;
		
		for(int i=1;i<number;i++) {
			if(number %i==0) {
				total+=i;
			}
		}
		if(total==number) {
			System.out.println("Sayı mukemmel sayıdır");
		}
		else {
			System.out.println("Sayı mukemmel değildir");
		}
		
		
		
	}
	

}
