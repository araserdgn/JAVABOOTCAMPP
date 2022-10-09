package overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseKrediManager[] baseKrediManager = new BaseKrediManager[] {
				new OgretmenKrediManager(), new TarımKrediManager(), new OgrenciKrediManager()
		};
		
		for(BaseKrediManager kredi : baseKrediManager) {
			System.out.println(kredi.hesapla(10000));
		}
	}

}
