package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'f';

		switch (grade) {

		case 'A':
			System.out.println("Mukemmel : geçtiniz");
			break;

		case 'B':
			System.out.println("Cok guzel : gectiniz.");
			break;
		case 'C':
			System.out.println("İyi : gectiniz.");
			break;
		case 'D':
			System.out.println("Fena Degil : gectiniz.");
			break;
		case 'F':
			System.out.println("Maalesef  : KAldınız..");
			break;
		default:
			System.out.println("Gecersiz not girdiniz");
		}

	}

}
