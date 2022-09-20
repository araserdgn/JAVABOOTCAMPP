package multiarray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] sehriler =new String[3][3];
				
		sehriler[0][0] ="istanbul";	
		sehriler[0][1] ="izmşr";	
		sehriler[0][2] ="adana";	
		sehriler[1][0] ="samsun";	
		sehriler[1][1] ="van";	
		sehriler[1][2] ="ankara";	
		sehriler[2][0] ="mugla";	
		sehriler[2][1] ="antalya";	
		sehriler[2][2] ="mardin";
		
		for(int i=0;i<=2;i++) {
			System.out.println("---------------------");
			for(int j=0;j<=2;j++) {
				System.out.println(sehriler[i][j]);
			}
		}
		
	}

}
