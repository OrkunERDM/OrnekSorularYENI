import java.util.Random;
import java.util.Scanner;

public class b24_1Den100eistenenSayiyiBulmaMaks6Seferde {

	public static void main(String[] args) {

		
		
		int alt=1,üst=63,tahmin,sayac=0;
		
		Random r=new Random();
		int tutulan=r.nextInt(64);
		
		do{
			
			tahmin=(alt+üst)/2;
			sayac++;
			
			if(tahmin==tutulan) {
				
				System.out.println("tutulan:"+ tutulan+" sayac:"+ sayac);
				break;
				
				
			}else if(tahmin>tutulan) {

				üst=tahmin;
				
			}else {
					alt=tahmin;
				}
				
				
			
			
			
		}while(tahmin!=tutulan);
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
