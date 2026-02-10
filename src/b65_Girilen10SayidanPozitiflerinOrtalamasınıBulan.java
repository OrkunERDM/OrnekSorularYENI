import java.util.Scanner;

public class b65_Girilen10SayidanPozitiflerinOrtalamasınıBulan {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		int sayi, toplam = 0, adet = 0;

		for (int i = 1; i <= 10; i++) {
		    System.out.print(i + ". sayıyı gir: ");
		    sayi = sc.nextInt();
		    if (sayi > 0) {
		        toplam += sayi;
		        adet++;
		    }
		}
		if (adet > 0)
		    System.out.println("Pozitif ortalama: " + (toplam / adet));
		else
		    System.out.println("Pozitif sayı girilmedi.");	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
