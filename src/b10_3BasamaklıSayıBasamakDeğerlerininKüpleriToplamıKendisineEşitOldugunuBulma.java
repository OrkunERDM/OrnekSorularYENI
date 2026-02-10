import java.util.Scanner;

public class b10_3BasamaklıSayıBasamakDeğerlerininKüpleriToplamıKendisineEşitOldugunuBulma {

	public static void main(String[] args) {

		int sayi, x, bas;

		int top = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("sayı gir: ");
		sayi = scan.nextInt();
		x = sayi;

		while (sayi > 9) {

			bas = sayi % 10;
			top = top + (bas * bas * bas);
			sayi=sayi/10;
		}

		top=top+(sayi*sayi*sayi);
		

		if (x == top) {

			System.out.println("eşit");

		} else {

			System.out.println("eşit değil");

		}

	}

}
