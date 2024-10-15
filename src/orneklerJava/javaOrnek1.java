package orneklerJava;

public class javaOrnek1 {

	public static void main(String[]args) {
		int sayi1=2666660;
		int sayi2=25;
		int sayi3=28888;
		int enBuyuk= sayi1;
		
		if(enBuyuk<sayi2){
			enBuyuk=sayi2;
			
		}
		if(enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		
		System.out.println("En buyuk:"+ enBuyuk);
	}
}
