import java.util.Scanner;

public class b48_GirilenStringiTersÇeviripYazdırma {

	public static void main(String[] args) {

		
		String metin;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("metin gir:");
		metin=sc.next();
		
		for(int i=metin.length()-1; i>=0; i--) {
			
			System.out.print(metin.charAt(i)+" ");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
