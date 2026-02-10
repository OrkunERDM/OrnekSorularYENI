import java.util.Scanner;

public class b55_BasamaklarınCarpimi {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("sayı gir: ");
		int sayi=sc.nextInt();
		
		int carpim=1;
		int basamak;
		
		while(sayi!=0) {
			
			
			basamak=sayi%10;
			carpim*=basamak;
			sayi=sayi/10;
			
		}System.out.println(carpim);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
