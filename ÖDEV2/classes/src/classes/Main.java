package classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerManager customerManager=new CustomerManager();
		CustomerManager customerManager2= new CustomerManager(); // new pahalıdır.
		customerManager=customerManager2;
		
		customerManager.Add();
		customerManager.Update();
		customerManager.Remove();
		
		//value type
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		// STACK          //HEAP kısmı
		int [] sayilar1 = new int[] {1,2,3,4};
		int [] sayilar2 = new int[] {5,6,7,8};
		sayilar2=sayilar1; // sayılar1 in sağ tarafı buraya geldi
		sayilar2[0]=10;
		System.out.println(sayilar2[0]);
		
		
	}

}

