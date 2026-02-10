import java.util.Scanner;

public class b13_Sayilarlaİşlem {

	public static void main(String[] args) {

		int neg = 0, cift = 1, sayi, i;
		int bol = 0;

		Scanner scan = new Scanner(System.in);

		for (i = 1; i <= 10; i++) {

			System.out.println(i + ". sayıyı gir: ");
			sayi = scan.nextInt();

			if (sayi % 2 == 0) {

				cift *= sayi;

			}
			if (sayi < 0) {

				neg += sayi;

			}
			if (sayi % 7 == 0) {

				bol++;

			}
			System.out.println("ciftlerin toplamı: " + cift);
			System.out.println("negatiflerin toplamı: " + neg);
			System.out.println("7ye eşit olanların toplamı: " + bol);

		}

	}

}
