package abstractClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WomanGameCalculator womanCalculator = new WomanGameCalculator();
		womanCalculator.hesapla();
		womanCalculator.gameOver();
		
		GameCalculator gameCalculator = new KidsGameCalculator();

		
		/* GameCalculator gameCalculator = new GameCalculator(); */
		
		// abstact sınıflar ASLA böyle new yapılamaz. İçindeki metodu da cagırmak gerekir
		
		/* 
		 * 		GameCalculator gameCalculator = new GameCalculator() {
			
			@Override
			public void hesapla() {
				// TODO Auto-generated method stub
				
			}
		};
		 * */
		
		
	}

}
