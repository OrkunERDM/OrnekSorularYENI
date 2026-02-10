import java.util.Scanner;

public class b41_StringKarakterinKaçKereYazıldgınıBulmak {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("metin giriniz: ");
		scanner.nextLine();
		
		String text=scanner.nextLine();
		System.out.println("hangi karakter sayılsın: ");
		
		char c=scanner.next().charAt(0);
		int count=0;
		
		for(char ch : text.toCharArray()) {
			
			if(ch==c) {
				
				count++;
				
			}
			
		}System.out.println(count);
	
		
		
		
		
		
		
		
	}

}
