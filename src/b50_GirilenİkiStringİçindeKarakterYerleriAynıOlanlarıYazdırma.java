import java.util.Scanner;

public class b50_GirilenİkiStringİçindeKarakterYerleriAynıOlanlarıYazdırma {

	public static void main(String[] args) {

		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("metin gir: ");
	String kelime=sc.nextLine();
	
	System.out.println("metin gir: ");
    String kelime2=sc.nextLine();
    
    int boy1=kelime.length();
    int boy2=kelime2.length();
    
    int deger = 0;
    
    if(boy1<=boy2) {
    	
    	 deger=boy1;
    }else {
		 deger=boy2;
	}
    
    for(int i=0; i<deger; i++) {
    	
   
    	if(kelime.charAt(i)==kelime2.charAt(i)) {
    		
    		System.out.print(kelime2.charAt(i)+" ");
    	}
    	
    	
    }
    	
    	
    	
   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
