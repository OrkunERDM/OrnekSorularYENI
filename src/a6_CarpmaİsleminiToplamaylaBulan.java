import java.util.Scanner;

public class a6_CarpmaİsleminiToplamaylaBulan {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int sayi1, sayi2;
		int carp = 0;

		System.out.println("1.sayıyı giriniz: ");
		sayi1 = scan.nextInt();

		System.out.println("2.sayıyı giriniz: ");
		sayi2 = scan.nextInt();

		while (sayi2 > 0) {

			carp = carp + sayi1;
			sayi2--;

		}
		System.out.println("sonuç: " + carp);

	}

}
