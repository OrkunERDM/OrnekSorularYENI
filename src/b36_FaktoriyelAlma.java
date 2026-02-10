import java.util.Scanner;

public class b36_FaktoriyelAlma {

	public static void main(String[] args) {

	
		Scanner scanner=new Scanner(System.in);
		
		int sayi,fakt=1;
		
		
		System.out.println("sayı gir: ");
		sayi=scanner.nextInt();
		
		if(sayi<0) {
			
			System.out.println("negatif sayının faktoriyeli olmaz.");
		}else {
			
			for(int i=1; i<=sayi; i++) {
				
				fakt*=i;
				
				
				
				
			}System.out.println(sayi + "! = " + fakt);
			
		}
		
		
		
		
		
		
		
		   
		   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
