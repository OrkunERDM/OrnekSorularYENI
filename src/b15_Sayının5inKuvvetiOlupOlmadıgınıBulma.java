import java.util.Scanner;

public class b15_Sayının5inKuvvetiOlupOlmadıgınıBulma {

	public static void main(String[] args) {

		int sayi;

		Scanner scan = new Scanner(System.in);

		System.out.println("sayı gir: ");
		sayi = scan.nextInt();

		if (sayi % 5 == 0) {

			System.out.println("sayı 5'in kuvvetidir.");

		} else {

			System.out.println("sayı 5'in kuvveti değildir.");
		}

	}

}
