import java.util.Scanner;

public class a4_KisininYasiniHesaplama {

	public static void main(String[] args) {

	int dyili;
	int yas;
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("bugünün yılını giriniz(yyyy): ");
	int byil=scan.nextInt();
	
	System.out.println("doğum yılınızı giriniz(yyyy): ");
	dyili=scan.nextInt();
	
	yas=byil-dyili;
	
	
	System.out.println("yaşınız:" +yas);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
