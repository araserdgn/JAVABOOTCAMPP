package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla() ; // Hesapla diye ben zorunlu tutuyorum fakat herkes kendi alanında override yapmalı demek
									// ben burda belirlemiyorum metodun içini o yuzden Abstract verdk
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
	// abstract zorunlu tutuyor metodlarını kullanmayı
	
}
