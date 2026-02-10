import java.util.Scanner;

public class b76_NegatifGirileneKadarGirilenSayilariToplama {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int sayi,toplam=0;
		
		System.out.println("sayı gir: ");
		sayi=sc.nextInt();
		
		
		
		while(sayi>=0) {
			
			
			toplam+=sayi;
			
			System.out.println("sayı gir: ");
			sayi=sc.nextInt();
			
		}System.out.println(toplam);
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
