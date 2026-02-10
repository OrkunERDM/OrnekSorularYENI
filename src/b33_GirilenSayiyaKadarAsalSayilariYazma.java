import java.util.Scanner;

public class b33_GirilenSayiyaKadarAsalSayilariYazma {
public static void main(String[]args) {

	
	
	Scanner scan = new Scanner(System.in);
    System.out.print("Bir sayı giriniz: ");
    int sayi = scan.nextInt();

    System.out.println(sayi + " sayısına kadar olan asal sayılar:");

    for (int i = 2; i <= sayi; i++) {
        boolean asal = true; 
        for (int j = 2; j <i; j++) {
            if (i % j == 0) {
                asal = false;
                break;
            }
        }

        if (asal) {
            System.out.print(i + " ");
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
