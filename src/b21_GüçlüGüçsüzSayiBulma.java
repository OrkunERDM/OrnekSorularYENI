import java.util.Scanner;

public class b21_GüçlüGüçsüzSayiBulma {

	public static void main(String[] args) {

		int sayi, bolen = 1, sayac = 1;

        Scanner scan=new Scanner(System.in);
        
        System.out.println("sayı gir: ");
	    sayi=scan.nextInt();
	    
	    
	    while(sayac<sayi) {
	    	
	     if(sayi%sayac==0) {
	    	 
	    	 bolen+=sayac;
	    	 sayac++;
	    	 
	    	 
	     }
	     
	     if(bolen>sayi) {
	 	    
		       System.out.println("sayı güçlü");	
		       break;
		    	
		    	
		    }else {
				
		    	System.out.println("sayı güçlü değil");
		    	break;
			}
	    
	    	
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
