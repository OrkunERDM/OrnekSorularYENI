import java.util.Scanner;

public class b63_BasamakSayisiKadarYıldızYazdir {

	public static void main(String[] args) {

		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("sayı gir: ");
		int sayi=sc.nextInt();
		
		int sayac=0;
		
		while(sayi>0) {
			
			int basamak=sayi%10;
			sayi=sayi/10;
			sayac++;	
			
		}
		
		for(int i=1; i<=sayac; i++) {
			
			System.out.print("* ");
			
		}
         		
		
		
		
		
		
		
		
		
		
	}

}
