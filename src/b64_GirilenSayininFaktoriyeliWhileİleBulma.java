import java.util.Scanner;

public class b64_GirilenSayininFaktoriyeliWhileİleBulma {

	public static void main(String[] args) {

		int i = 1, fakt = 1, sayi;

		Scanner sc = new Scanner(System.in);
		System.out.println("sayı gir: ");
		sayi = sc.nextInt();

		while (sayi >= i) {

			fakt *= i;
			i++;

		}
		System.out.println(fakt);

	}

}
