import java.util.Scanner;

public class b43_StringinİlkHarfiBuyukDiğerleriKucukYazdırma {

	public static void main(String[] args) {

		
		String metin;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("metin gir: ");
		metin=sc.nextLine();
		
		if(metin.length()>0) {
			
			 String res = metin.substring(0,1).toUpperCase() + metin.substring(1).toLowerCase();
	            System.out.println("Formatlanmış = " + res);
		}else {
			System.out.println("metin gir");
		}
		
		
		
		
		
		
		
		
	}

}
