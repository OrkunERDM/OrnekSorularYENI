import java.util.Scanner;

public class a5_GirilenSayininFaktoriyeli {

	public static void main(String[] args) {

		int sayi;
		int fakt = 1;

		Scanner scan = new Scanner(System.in);

		System.out.println("sayı gir: ");
		sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i++) {

			fakt = i * fakt;

		}
		System.out.println("sayının faktoriyeli: " + fakt);

	}

}
