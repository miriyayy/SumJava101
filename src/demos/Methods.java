package demos;

public class Methods {
  public static void main (String [] args) {
	  sayiBulmaca();
	  sayiBulmaca();
	  sayiBulmaca();
	  sayiBulmaca();
	  
  }
  //camel casing
  public static void sayiBulmaca() {
	  int [] numbers= new int [] {1,2,3,4,5,7,9,0};
		int aranacak = 6;
		boolean varMi=false;
		
		for(int number: numbers) {
			if(number== aranacak) {
				varMi= true;
				break;
			}
			
		}
  
		 String mesaj="";
		if(varMi) {
			//mesajVer("Sayı mevcuttur"+ aranacak);
			mesaj= "Sayı mevcuttur"+aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("Sayı mevcut değildir"+ aranacak);
		}
  }	
		public static void mesajVer(String mesaj ) {
			
			System.out.println(mesaj);
		}
		
		
  
}
