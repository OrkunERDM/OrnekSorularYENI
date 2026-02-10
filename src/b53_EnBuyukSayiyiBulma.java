import java.util.Scanner;

public class b53_EnBuyukSayiyiBulma {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		
		for(int i=1; i<=5; i++) {
			
			System.out.print(i+".sayıyı gir: ");
			int sayi=sc.nextInt();
			
			if(sayi>max) {
				
				max=sayi;
			}
			
		}System.out.print("en büyük sayı: "+max);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
