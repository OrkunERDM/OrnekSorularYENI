import java.util.Scanner;

public class b67_1000ile2000arasındaSayilarınBasamakDeğerleriOrtalaması {

	public static void main(String[] args) {

		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1000 ile 2000 arasında sayı: ");
		int sayi=sc.nextInt();
		
		int toplam=0,sayac=0;
		
		if(sayi>1000&&sayi<2000){
			
		while(sayi>0) {
			
			
			int basamak=sayi%10;
			toplam+=basamak;
			sayi=sayi/10;
			
			sayac++;
			
		}System.out.println("ortalama: "+(double)toplam/sayac);
			
		}else {
			System.out.println("doğru değer giriniz.");
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
