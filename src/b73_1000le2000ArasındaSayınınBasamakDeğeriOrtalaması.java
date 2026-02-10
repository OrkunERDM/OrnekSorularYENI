import java.util.Scanner;

public class b73_1000le2000ArasındaSayınınBasamakDeğeriOrtalaması {

	public static void main(String[] args) {

		
int sayi,toplam=0,deger;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("1000 ve 2000 arasında sayı gir: ");
		sayi=sc.nextInt();
		
		deger=sayi;
		
		while(deger>0) {
			
			if(sayi>1000&&sayi<2000) {
			
			int basamak=deger%10;
			toplam+=basamak;
			deger=deger/10;
			
			}else{
				System.out.println("doğru aralıkta değer giriniz.");
				break;
			}
				
		}System.out.println(toplam/4);
		
		
		
		
		
		
		
		
		
	}

}
