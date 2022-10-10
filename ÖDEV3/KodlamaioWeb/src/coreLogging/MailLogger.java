package coreLogging;

public class MailLogger implements Logger {

	@Override
	public void Log(String data) {
		// TODO Auto-generated method stub
		System.out.println("E-maile loglandı: "+ data);
	}

}
