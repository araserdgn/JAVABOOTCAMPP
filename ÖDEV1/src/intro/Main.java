package intro;

import java.util.Iterator;

public class Main {

	//main javada bslangıc noktasıdır
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Selamun aleykum");
	
		String metin ="ilginizi cekebilir";
				String altMetin="vade süresi";
				
			System.out.println(metin);	
			
			int vade=12;
			
			double dolarDun=18.14;
			double dolarBugun =18.10;
			
			boolean dolarNasıl =false;
			
			String okYonu="";
			
			if (dolarBugun < dolarDun) {
				okYonu="down.svg";
				System.out.println(okYonu);
			} 
			else if (dolarBugun > dolarDun)
			{
				okYonu="up.svg";
				System.out.println(okYonu);
			}
			else {
				okYonu="equal.svg";
				System.out.println(okYonu);
			}
			
			
			String [] krediler = {"hızlı kredi","masabası","mutlu emekli"};
			
			
			
			for (int i=0 ; i < krediler.length;i++) {
				
				System.out.println(krediler[i]); 
			}
			
			
	}

}
