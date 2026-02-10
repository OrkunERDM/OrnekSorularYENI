import java.util.Scanner;

public class b37_İntDeğeriStringYazma {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("1le 99 arası sayı gir: ");
		int sayi = scanner.nextInt();
		
		int onlar=sayi/10;
		int birler=sayi%10;
		
		if(sayi<0&&sayi>99) {
			
			System.out.print("sayıyı doğru girin.");
		}
		else if(onlar==1) {
			
			System.out.print("on");
		}else if(onlar==2) {
			
			System.out.print("yirmi");
		}else if(onlar==3) {
			
			System.out.print("otuz");
		}else if(onlar==4) {
			
			System.out.print("kırk");
		}else if(onlar==5) {
			
			System.out.print("elli");
		}else if(onlar==6) {
			
			System.out.print("altmış");
		}else if(onlar==7) {
			
			System.out.print("yetmiş");
		}else if(onlar==8) {
			
			System.out.print("seksen");
		}else if(onlar==9) {
			
			System.out.print("doksan");
		}
		
		  if(birler==1) {
			
			System.out.print(" bir");
		}else if(birler==1) {
			
			System.out.print(" bir");
		}else if(birler==2) {
			
			System.out.print(" iki");
		}else if(birler==3) {
			
			System.out.print(" üç");
		}else if(birler==4) {
			
			System.out.print(" dört");
		}else if(birler==5) {
			
			System.out.print(" beş");
		}else if(birler==6) {
			
			System.out.print(" altı");
		}else if(birler==7) {
			
			System.out.print(" yedi");
		}else if(birler==8) {
			
			System.out.print(" sekiz");
		}else if(birler==9) {
			
			System.out.print(" dokuz");
		}
		

			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

}
