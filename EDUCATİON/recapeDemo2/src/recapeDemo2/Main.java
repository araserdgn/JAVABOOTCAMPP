package recapeDemo2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList= {1.2,2.5,3.6,4.7,5.8,6.6 }; 
		double total=0;
		double max=myList[0];
		
		for(double number:myList) { // myList içinde herbir elemanı gez ve ona number de
			if(max<number) {
				max=number;
			}
			total=total+number;
			System.out.println(number);
		}
		System.out.println("Toplam :" + total);
		System.out.println("En buyuk sayı :" + max);
	}

}
