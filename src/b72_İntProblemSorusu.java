import java.util.Scanner;

public class b72_İntProblemSorusu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sayi, toplam = 0, terim = 2, sayac = 0;

		for (int i = 1; i <= 10; i++) {

			toplam = terim;
			terim = terim * 2;
System.out.println(terim);
		}
		System.out.println((double) toplam / 10);
	
	
	
	
	}

}
