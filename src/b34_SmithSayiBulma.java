import java.util.Scanner;

public class b34_SmithSayiBulma {

	public static void main(String[] args) {

		
		int sayi,x,i=2,top=0,top1=0,y;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("sayıyı gir: ");
		sayi=scan.nextInt();
		
		x=sayi;
		
		while(sayi>10) {
			
			top=top+sayi%10;
			sayi=sayi/10;
			
		}
		top=top+sayi;
		
		while(x>1) {
			
			if((x%i)==0) {
				
				if(i==2||i==3||i==5||i==7) {
					
					top1=top1+i;
					x=x/i;
				}
				else {
					y=i;
					while(y>10) {
						top1=top1+y%10;
						y=y/10;
					}
					top1=top1+y;
					x=x/i;
				}
				
			}
			else {
				i++;
			}
		}
		if(top==top1) {
			
			System.out.println("smith sayısıdır.");
		}else {
			System.out.println("smith sayısı değildir.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
