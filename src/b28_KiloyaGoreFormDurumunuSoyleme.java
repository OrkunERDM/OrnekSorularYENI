import java.util.Scanner;

public class b28_KiloyaGoreFormDurumunuSoyleme {

	public static void main(String[] args) {

		int kilo,boy;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Kilo gir: ");
		kilo=sc.nextInt();
		
		System.out.println("Boy gir: ");
		boy=sc.nextInt();
		
		
		boy=boy%100;
		
		if(boy-kilo<11) {
			
			System.out.println("kilo ver");
			
		}else if(boy-kilo>11) {
			
			System.out.println("kilo al");
			
		}else {
			
			System.out.println("kilon uygun");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
