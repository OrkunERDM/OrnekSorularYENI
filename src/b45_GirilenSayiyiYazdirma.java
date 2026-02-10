import java.util.Scanner;

public class b45_GirilenSayiyiYazdirma {

	public static void main(String[] args) {

		
		int sayi;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("sayı gir: ");
		sayi=sc.nextInt();
		
		String s=Integer.toString(sayi);
		
		for(int i=0; i<s.length(); i++) {
			
			for(int j=0; j<=i; j++) {
				
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println("");
		}
		
		
		
		
	}

}
