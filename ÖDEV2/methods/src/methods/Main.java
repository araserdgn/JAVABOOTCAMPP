package methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sayıBulmaca();

	}
	
	public static void sayıBulmaca() {
		int[] sayilar = new int[] {1,2,3,5,7,8,0};
		int aranan=5;
		boolean varMı=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranan) {
				varMı=true;
			}
		}
		
		if(varMı) {
			mesajVer("Sayı mevcuttur :" +aranan);
		}
		else {
			mesajVer("Sayı mevcut değildir :" +aranan);
		}
	}
	
	//camelCase isimlendirmesidir
	
	public static void mesajVer (String mesaj) {
		System.out.println(mesaj);
	}

}
