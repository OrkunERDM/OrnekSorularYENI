import java.util.Scanner;

public class b51_GirilenSayilardanÇiftlerinOrtalamasınıYazdırma {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);		
		
		int t;
		int sayac=0;
		int toplam=0;
	
		
		System.out.println("sayıları gir: ");
		
		
		for(;;) {
			t=sc.nextInt();
			if(t==0) {
				
				break;
			}
			if(t%2==0) {
				toplam+=t;
				sayac++;
				
			}
			
		}System.out.println("çiftlerin ortalaması: "+(double) toplam/(double)sayac);
	
	
	
	
	
	}

}
