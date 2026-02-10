import java.util.Scanner;

public class b63_3ve5inOrtakKatlari {
public static void main(String[]args) {
	
	
 	

	 Scanner sc = new Scanner(System.in);

     System.out.print("Bir sayı gir: ");
     int n = sc.nextInt();

     boolean bulundu = false;

     for (int i = 1; i <= n; i++) {
         if (i % 3 == 0 && i % 5 == 0) {
             System.out.println(i);
             bulundu = true;
         }
     }

     if (!bulundu) {
         System.out.println("Ortak kat yok.");
     }
 

        		 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
