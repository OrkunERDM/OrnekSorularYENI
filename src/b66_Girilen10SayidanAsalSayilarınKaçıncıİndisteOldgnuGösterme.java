import java.util.Scanner;

public class b66_Girilen10SayidanAsalSayilarınKaçıncıİndisteOldgnuGösterme {

	public static void main(String[] args) {

		
Scanner sc = new Scanner(System.in);
		

		System.out.println("sayı gir: ");

	     for(int i=1; i<=10; i++) {
	    	 
	    	 int sayi,sayac=0;
	    	 sayi=sc.nextInt();
	    	 
	    	 if(sayi>1) {
	    		 
	    		 for(int j=2; j<sayi; j++) {
	    			 
	    			 if(sayi%j==0) { 
	    				 sayac++;
	    				 break; 
	    			 }
	  
	    		 } 
	    	 }if(sayac==0) {
    			 
    			 System.out.println(i+". indisteki sayı asaldır."); 
    		 }
	    	  
	     }
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
