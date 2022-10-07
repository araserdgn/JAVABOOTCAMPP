package stringDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mesaj = " Bugun hava çok güzel. ";
		System.out.println(mesaj);
		/*
		 * System.out.println("Eleman sayısı " + mesaj.length());
		 * System.out.println("5. eleman : " + mesaj.charAt(4)); // kar. içindeki indeks
		 * secer System.out.println(mesaj.concat("yasasın!"));
		 * System.out.println(mesaj.startsWith("B")); // B ile baslıyorsa true
		 * System.out.println(mesaj.endsWith(".")); // . ile bitiyorsa true char []
		 * karakterler = new char[5]; mesaj.getChars(0,5,karakterler,0); // 0 dan basla
		 * 5. kar. kadar git ve 0. indeks basla+ System.out.println(karakterler);
		 * 
		 * System.out.println(mesaj.indexOf('a')); // a harfi kaçıncı sırada
		 * System.out.println(mesaj.indexOf("ço")); // harfi kaçıncı sırada
		 * System.out.println(mesaj.lastIndexOf("a")); // sondan aramaya baslar
		 */
		
		System.out.println(mesaj.replace( 'u', 'p')); // u harflerini p ile değiştir. Yeni çıktı uretir
		
		System.out.println(mesaj.substring(2,6)); // 2. indeksten itibaren 6. indekse kdr yazar
		
		for(String kelime: mesaj.split(" ")) { // boslukları çıkarıp alt alta dizi halde ya zar
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());
	}

}
