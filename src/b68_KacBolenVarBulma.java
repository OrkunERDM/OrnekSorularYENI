import java.util.Scanner;

public class b68_KacBolenVarBulma {

	public static void main(String[] args) {

	
		
		Scanner sc = new Scanner(System.in);

		int sayac = 0, sayi;

		System.out.println("sayi gir: ");
		sayi = sc.nextInt();

		for (int i = 1; i <= sayi; i++) {

			if (sayi % i == 0) {

				sayac++;

			}

		}
		System.out.println(sayac);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
