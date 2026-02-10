import java.util.Scanner;

public class b59_BasamakDegerlerininToplami {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		int sayi;
		int toplam=0;
		System.out.println("sayı gir: ");
		sayi=sc.nextInt();
		
		while(sayi>0) {
			
			int basamak=sayi%10;
			toplam+=basamak*basamak;
			sayi=sayi/10;
			
		}System.out.println(toplam);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
