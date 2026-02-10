import java.util.Scanner;

public class b52_GirilenSayininKaçBasamakliOldugunuBulma {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("sayı gir: ");
		int sayi=sc.nextInt();
		
		int sayac=1;
		
		while(sayi>9) {
			
			sayi=sayi/10;
			sayac++;
			
			
		}System.out.println("sayı "+sayac+" basamaklı");
		
		
		
		
		
		
		
		
		
	}

}
