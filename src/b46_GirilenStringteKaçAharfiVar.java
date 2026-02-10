import java.util.Scanner;

public class b46_GirilenStringteKaçAharfiVar {
public static void main(String[]args) {
	
	
	//kaç tane aa vardır? 
	
	String s; 
	int sayac=0;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("metin gir: ");
	s=sc.next();
	
	for(int i=0; i<s.length()-1; i++) {
		
		if(s.charAt(i)=='a'&&s.charAt(i+1)=='a') {
			
			sayac++;
			
		}
		
		
	}System.out.println("girilen metinde "+sayac+" adet aa vardır.");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
