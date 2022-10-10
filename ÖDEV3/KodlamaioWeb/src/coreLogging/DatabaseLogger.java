package coreLogging;

public class DatabaseLogger implements Logger{

	@Override
	public void Log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Veritabanına loglandı: "+data);
	}

}
