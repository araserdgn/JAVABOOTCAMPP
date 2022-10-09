package overriding;

public class BaseKrediManager {
	
	
	public /*final*/ double hesapla(double tutar) { // FİNAL eklersen overriding yapamaz baska sınıfta
		return tutar*1.18;
	}

}

// bir sınıf sadece bir abst. inherite edebilir.