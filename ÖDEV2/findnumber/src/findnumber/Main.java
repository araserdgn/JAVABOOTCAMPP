package findnumber;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] sayilar = new int[] {1,2,3,5,7,8,0};
		int aranan=5;
		boolean varMı=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranan) {
				varMı=true;
			}
		}
		
		if(varMı) {
			System.out.println("Aranan sayı mecvut");
		}
		else {
			System.out.println("Aranan mevcut DEĞİLDİR");
		}
	}

}
