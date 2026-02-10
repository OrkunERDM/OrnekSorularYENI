import java.util.Scanner;

public class b29_DaireAlanCevre {

	public static void main(String[] args) {

		
		int DaireAlan,DaireCevre,YariCap,pi=3;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Dairenin yarı çapı kaçtır? ");
		YariCap=scan.nextInt();
		
		DaireAlan=(int) (pi*Math.pow(YariCap, 2));
		DaireCevre=2*pi*YariCap;
		
		System.out.println("Daire alanı:"+DaireAlan+" Daire çevre:"+DaireCevre);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
