import java.util.Scanner;

public class a9_GirilenSayininKaçBasamaklıOldugunuBulma {

	public static void main(String[]args) {
		
		
		float sayi1,i=1;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("sayı giriniz: ");
		sayi1=scan.nextFloat();
		
		while(sayi1>9) {
			
			sayi1=sayi1/10;
			i++;
			
		}System.out.println("basamak sayısı: "+i );
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
