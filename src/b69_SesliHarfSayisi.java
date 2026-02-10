import java.util.Scanner;

public class b69_SesliHarfSayisi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sayac = 0;

		System.out.print("kelime gir: ");
		String s = sc.nextLine().toLowerCase();

		for (int i = 0; i <= s.length() - 1; i++) {

			char c = s.charAt(i);

			if (c == 'a' || c == 'e' || c == 'ı' || c == 'i' || c == 'o' || c == 'ö' || c == 'u' || c == 'ü') {

				sayac++;
			}

		}
		System.out.println(sayac);

	}

}
