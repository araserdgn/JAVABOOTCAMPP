package methods2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj ="Bugun hava çok güzel";
		
		String yeniMesaj=mesaj.substring(0,2); // 0 ile 2. indeks arasını alır
		System.out.println(yeniMesaj);
		
		String mesaj2 = mesajDon();
		System.out.println(mesaj2);
		
		int sayi=topla(5,7);
		
		System.out.println(sayi);
		
		int toplam2=topla2(5,6,8,7,9);
		
		System.out.println(toplam2);

	}
	
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static  void sil() {
		System.out.println("Silindi");
	}
	
	public static void guncelle() {
		System.out.println("Guncellendi");
	}
	
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	public static int topla2(int... sayilar) { // BURAYA İNTAGER ARRAY GÖNDERMİŞ GİBİ DÜŞÜN
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		
		return toplam;
	}
	
	public static String mesajDon() {
		return "Ankara";
	}
	
	

}
