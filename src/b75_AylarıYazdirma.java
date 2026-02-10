import java.util.Scanner;

public class b75_AylarıYazdirma {

	public static void main(String[] args) {

		
		 Scanner sc = new Scanner(System.in);
	        int ay = 0;

	        while (ay < 1 || ay > 12) {
	            System.out.print("1-12 arası bir sayı giriniz: ");
	            ay = sc.nextInt();

	           /* if (ay < 1 || ay > 12) {
	                System.out.println("Hatalı giriş! Tekrar deneyin.");
	            }*/
	        }

	        if (ay == 1) System.out.println("Ocak");
	        if (ay == 2) System.out.println("Şubat");
	        if (ay == 3) System.out.println("Mart");
	        if (ay == 5) System.out.println("Mayıs");
	        if (ay == 6) System.out.println("Haziran");
	         if (ay == 7) System.out.println("Temmuz");
	         if (ay == 8) System.out.println("Ağustos");
	         if (ay == 9) System.out.println("Eylül");
	         if (ay == 10) System.out.println("Ekim");
	         if (ay == 11) System.out.println("Kasım");
	         if (ay == 12) System.out.println("Aralık");
	    

     
		
		
		
		
		
		
		
		
	}

}
