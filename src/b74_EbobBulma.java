import java.util.Scanner;

public class b74_EbobBulma {

	public static void main(String[] args) {

		int a, b;

		Scanner sc = new Scanner(System.in);

		System.out.println("sayı gir: ");
		a = sc.nextInt();

		System.out.println("sayı gir: ");
		b = sc.nextInt();

		while (a != b) {

			if (a > b) {

				a = a - b;
			} else {
				b = b - a;
			}

		}
		System.out.println("ebob: " + b);

		
		
		
		
		
		
		
		
	}

}
