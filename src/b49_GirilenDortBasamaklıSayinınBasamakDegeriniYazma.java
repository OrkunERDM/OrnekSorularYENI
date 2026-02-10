import java.util.Scanner;

public class b49_GirilenDortBasamaklıSayinınBasamakDegeriniYazma {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("4 basamaklı sayı gir: ");
		int sayi=sc.nextInt();
		
		System.out.println(sayi/1000+" sayının binler basamağı");
		
		sayi=sayi-(sayi/1000)*1000;
		
		System.out.println(sayi/100+" sayının yüzler basamağı");
		
		sayi=sayi-(sayi/100)*100;
		
		System.out.println(sayi/10+" sayının onlar basamağı");
		
		sayi=sayi-(sayi/10)*10;
		
		System.out.println(sayi+" sayının birler basamağıdır");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
