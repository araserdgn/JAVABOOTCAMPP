package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
		}
		
		System.out.println("FOR Program bitti");
		
		int i=1;
		
		//while
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("While döngüsü bitti");
		
		//DO-WHİLE
		int j=1;
		do {
			
			System.out.println(j);
			j+=2;
		} while(j<10);
			
		System.out.println("Do-while dongusu bitti");

	}

}
