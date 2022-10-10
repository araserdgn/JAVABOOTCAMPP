package coreLogging;

public class FileLogger implements Logger {

	@Override
	public void Log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Dosyaya loglandı : "+data);
	}

}
