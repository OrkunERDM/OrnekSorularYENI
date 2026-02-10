import java.util.Scanner;

public class b11_TekSayilarınToplamininÇiftSayilarınToplamınaOranınıBulma {

	public static void main(String[] args) {

		
		int tek=0,cift=0,i;
		int sayi;
		int oran;
		
		Scanner scan=new Scanner(System.in);
		
		for( i=1; i<=6; i++) {
			
			System.out.println(i+"."+"sayıyı giriniz: " );
			sayi=scan.nextInt();
			
			if(sayi%2==0) {
				
				cift+=sayi;
					
				}else {
					
					tek+=sayi;
					
				}
			
		}
		
		oran=cift/tek;
		System.out.println(oran);
		
		
		
        
		
		
		
		
		
		
	}

}
