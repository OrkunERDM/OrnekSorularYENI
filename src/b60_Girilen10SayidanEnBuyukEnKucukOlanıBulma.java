import java.util.Scanner;

public class b60_Girilen10SayidanEnBuyukEnKucukOlanıBulma {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		int sayi;
        System.out.println("1. sayıyı gir: ");
        sayi=sc.nextInt();
        int max=sayi;
        int min=sayi;
        
        for(int i=2; i<=10; i++) {
       
        System.out.println(i+". sayıyı gir: ");
        sayi=sc.nextInt();
        
        
       if(sayi>max) {
    	   max=sayi;
       }if(sayi<min) {
		min=sayi;
	}
      	
        }System.out.println("en büyük: "+max);
        System.out.println("en küçük: "+min);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
