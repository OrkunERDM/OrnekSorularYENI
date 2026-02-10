
public class b19_1le100ArasındakiCiftSayılarınToplamıMukemmelSayiMı {

	public static void main(String[] args) {

		
		
		int sayi = 0;
		int top=0;
		
		for(int i=1; i<=100; i++) {
			
			i++;
			top+=i;
			sayi=top;
				
		}System.out.println(sayi);
		
		for(int sayac=1; sayac<sayi; sayac++) {
			
			if(sayi%sayac==0) {
				
				top+=sayac;
				
			}
			
		}if(top==sayi) {
			
			System.out.println("sayı mukemmel");
		}else {
			System.out.println("mukemmel değil");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
