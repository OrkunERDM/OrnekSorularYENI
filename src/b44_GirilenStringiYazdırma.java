import java.util.Scanner;

public class b44_GirilenStringiYazdırma {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		String kelime;
		
		System.out.println("kelime gir: ");
		kelime=sc.next();
		
		for(int i=0; i<kelime.length(); i++) {
			
			for(int j=0; j<=i; j++) {
			
				System.out.print(kelime.charAt(j)+"");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
