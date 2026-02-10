import java.util.Scanner;

public class b26_BinaryDecimalDonusumu {

	public static void main(String[] args) {

		
		
		int sayi, bas, sayac=0;
		double top=0;
		
		Scanner oku=new Scanner(System.in);
		
		System.out.print("Binary sayı giriniz=");
		sayi=oku.nextInt(); 
		
		
		while(sayi>9) {
		bas=sayi%10;
		sayi=sayi/10;
		top=top+bas*Math.pow(2,sayac);
		sayac++;
		
		}
		top=top+sayi*Math.pow(2,sayac);
		System.out.print("Decimal Karşılığı="+top);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
