import java.util.Scanner;

public class b61_GirilenSayiyaKadarCiftlerinCarpimiTeklerinToplami {

	public static void main(String[] args) {
		 
		
		
		
		Scanner sc=new Scanner(System.in);
		    
		    System.out.println("sayı gir: ");
			int sayi=sc.nextInt();
			int çarpim=1;
			int toplam=0;
			
		    for(int i=1; i<=sayi; i++) {
		    	
		    	if(i%2==0) {
		    		
		    		çarpim*=i;
		    	}else {

		    	toplam+=i;
		    	
		    	}
		    	
		    	
		    }System.out.println("çiftlerin çarpımı: "+çarpim);
			System.out.println("teklerin toplamı: "+toplam);
			
			
			
			
			
			
			
			
			
	}

}
