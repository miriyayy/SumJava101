package demos;

public class Methods2 {
	 public static void main (String [] args) {
		 String mesaj="bugun hava cok güzel";
		String yeniMesaj= sehirVer();
				//mesaj.substring(0,2);
		System.out.println(yeniMesaj);
		
		 int sayi=topla(5,7);
		 System.out.println(sayi);
		 
		 int toplam=topla2(2,3,4,5,6,10);
		 System.out.println(toplam);
	 }
	 //void operasyon- fonskiyondan bir şey yapmasını istiyoruz
	 public static void ekle() {
		 System.out.println("Eklendi");
	 }
	 public static void sil(){
		 System.out.println("Silindi");
	 }
	 public static void guncelle(){
		 System.out.println("Gün");
		 
	 }
	 public static int topla(int sayi1,int  sayi2) {
		 return sayi1+sayi2;
	 }
	 
	 public static int topla2(int... sayilar) {
		 int toplam=0;
		 for (int sayi:sayilar) {
			 toplam+=sayi;
		 }
		 return toplam;
	 }
	 
	 public static String sehirVer() {
		 return "ankara";
	 }
}
