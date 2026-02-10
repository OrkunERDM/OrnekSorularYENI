import java.util.Scanner;

public class b25_SayiBinaryDönüşümü {

	public static void main(String[] args) {

		
		int sayi, i=0;
		double top=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Decimal sayı giriniz=");
		
		sayi=scan.nextInt();
		while(sayi>0)
		{
		
		top=top+(sayi%2)*Math.pow(10,i);
		sayi=sayi/2;
		i++;
		}
		sayi=sayi/2;
		top=top+sayi*Math.pow(10,i);
		System.out.print("Binary Karşılığı="+top);
		
		
		
		
		
		
		
		
		
	}

}
