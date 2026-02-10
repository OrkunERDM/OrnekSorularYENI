import java.util.Scanner;

public class b56_BasamaklarınÇiftOlanlarToplamı {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("sayı gir: ");
		int sayi=sc.nextInt();
		
		int toplam=0;
		int basamak;
		
		while(sayi!=0) {
			
			
			basamak=sayi%10;
			
			if(basamak%2==0) {
				
		    toplam+=basamak;
			}
			sayi=sayi/10;
			
		}System.out.println(toplam);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
