import java.util.Scanner;

public class b58_5eBolunenleriYazdırma {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("başlangıç sayısı: ");
		int sayi=sc.nextInt();
		
		System.out.println("bitiş sayısı: ");
		int sayi1=sc.nextInt();
		
		for(int i=sayi; i<=sayi1; i++) {

			if(i%5==0) {
				System.out.print(i+" ");
				
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
