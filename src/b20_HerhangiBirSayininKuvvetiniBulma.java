import java.util.Scanner;

public class b20_HerhangiBirSayininKuvvetiniBulma {

	public static void main(String[] args) {

		
		
		int sayi;
		int us;
		int top=1;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("sayı gir: ");
		sayi=scan.nextInt();
		
		System.out.println("kaçıncı üssünü almak istersin?");
		us=scan.nextInt();
		
		while(us>0) {
			
			top=top*sayi;
			us--;
			
		}System.out.println("sonuc:"+top);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
