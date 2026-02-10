import java.util.Scanner;

public class b62_AsalSayiKontrolü {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
		int sayi;
		boolean asal=true;

		System.out.println("sayı gir: ");
        sayi=sc.nextInt();
        
        if(sayi<1) {
        	asal=false;
      
        }else {
        
        for(int i=2; i<=sayi-1; i++) {
        	
        		if(sayi%i==0) {
        			
        			asal=false;
        			break;		
        		}
        		
        	}if(asal) {
            	
            	System.out.println("asal");
            }else {
				System.out.println("asal değil");
			}
        	
        	
        }
        
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
