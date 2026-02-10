import java.util.Scanner;

public class b54_PalindromSayi {

	public static void main(String[] args) {

		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("sayı gir: ");
		int sayi1=sc.nextInt();
		
		int basamak;
		int ters=0;
		int palindrom;
		
		int sayi=sayi1;
		
		while(sayi!=0) {
			
			basamak=sayi%10;
			ters=ters*10+basamak;
			sayi=sayi/10;
			
			
			
		} if(sayi1==ters) {
			
			System.out.println("palindrom sayı");
			
		}else {
			System.out.println("palindrom değil");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
