import java.util.Scanner;

public class b32_DenklemiKokleriniBulma {

	public static void main(String[] args) {

		
		int kok,a,b,c;
		double x,y;
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("a nedir?");
		a=scan.nextInt();
		
		System.out.println("b nedir?");
		b=scan.nextInt();
		
		System.out.println("c nedir?");
		c=scan.nextInt();
		
		
		if((b*b)-(4*a*c)<0) {
			
			System.out.println("reel kök yok");
			
			
		}else if((b*b)-(4*a*c)==0) {
			
			x=-b/2*a;
			System.out.println("tek kök vardır: "+x);
			
		}else {
			
			x=(-b)-Math.sqrt((b*b)-(4*a*c))/2*a;
			y=(-b)+Math.sqrt((b*b)-(4*a*c))/2*a;
			
			System.out.println("iki kök vardır: "+x+","+y);
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
