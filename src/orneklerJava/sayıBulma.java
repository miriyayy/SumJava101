package orneklerJava;

public class sayıBulma {
	public static void main(String[] args) {
		int [] numbers= new int [] {1,2,3,4,5,7,9,0};
		int aranacak = 6;
		boolean varMi=false;
		
		for(int number: numbers) {
			if(number== aranacak) {
				varMi= true;
				break;
			}
			
		}
		
		if(varMi) {
			System.out.println("Sayı mevcuttur");
		} else {
			System.out.println("Sayı mevcut değildir");
		}
		
	}
}
