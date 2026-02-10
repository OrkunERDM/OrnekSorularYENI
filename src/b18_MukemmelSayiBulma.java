import java.util.Scanner;

public class b18_MukemmelSayiBulma {

	public static void main(String[] args) {

		
		int sayi, sayac; 
		int top=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("sayi gir: ");
		sayi=scan.nextInt();
		
		for(sayac=1; sayac<sayi; sayac++) {
			
			if(sayi%sayac==0) {
				
				top+=sayac;
			
			}
			
		}
		if(top==sayi) {
			
			System.out.println("sayı mükemmel");
			
			
		}else {
			
			System.out.println("mukemmel sayı değil");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
