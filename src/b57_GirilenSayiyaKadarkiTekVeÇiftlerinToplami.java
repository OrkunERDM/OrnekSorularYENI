import java.util.Scanner;

public class b57_GirilenSayiyaKadarkiTekVeÇiftlerinToplami {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		int sayi;

		System.out.println("sayı gir: ");
		sayi = sc.nextInt();

		int tektoplam = 0;
		int cifttoplam = 0;

		for (int i = 0; i < sayi; i++) {

			if (i % 2 == 0) {

				cifttoplam += i;

			}
			else {

				tektoplam += i;

			}

		}
		System.out.println("çiftlerin toplamı: " + cifttoplam);
		System.out.println("teklerin toplamı: " + tektoplam);
		
		
		
		
		
		
		
		
		
		
		
	}

}
