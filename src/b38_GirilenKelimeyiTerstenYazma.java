import java.util.Scanner;

public class b38_GirilenKelimeyiTerstenYazma {

	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("kelime gir: ");
		String kelime=scanner.next();
		
		int uzunluk=0;
		
		while(true) {
			
			if(kelime.charAt(uzunluk)==kelime.charAt(uzunluk)) {
				
				uzunluk++;
				
				if(uzunluk>=kelime.length()) {
                break;
				}
				
			}
			
			
			
		}for(int i=uzunluk-1; i>=0; i--) {
			
			System.out.print(kelime.charAt(i));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
