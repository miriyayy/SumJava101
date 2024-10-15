package demos;

public class Arrays {
	public static void main(String[] args) {
		String ogrenci1 = "engin";
		String ogrenci2 = "derin";
		String ogrenci3 = "salih";
		String ogrenci4 = "miray";


		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);


		System.out.println("----------------------------------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "engin";
		ogrenciler[1] = "derin";
		ogrenciler[2] = "salih";
		ogrenciler[3] = "miray";
		// eger ben buraya ogrenciler[4] = "sude"; bu ifadeyi eklersem ve yukarıda
		// String[5] yapmazsam
		// ArrayIndexOutOfBoundsException hatası alırım bu da arrayin
		// indexinin sınıfrları dışında oldugunun hatasını alırız

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);

		}
		System.out.println("----------------------------------------------");

		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}
}
