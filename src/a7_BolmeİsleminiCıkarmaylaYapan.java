import java.util.Scanner;

public class a7_BolmeİsleminiCıkarmaylaYapan {

	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		
		int bolunen,bolen,i = 0;
		
		System.out.println("bölünecek sayıyı giriniz: ");
		bolunen=scan.nextInt();
		
		System.out.println("bölen sayıyı giriniz: ");
		bolen=scan.nextInt();
		
		while(bolunen>bolen) {
			
			bolunen=bolunen-bolen;
			i++;
		
		}System.out.println("Bölüm: "+i+"Kalan: "+bolunen);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
