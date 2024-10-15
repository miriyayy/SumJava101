package demos;

public class Strings {
	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";

		System.out.println(mesaj);

		System.out.println("Eleman sayısı : " + mesaj.length());

		System.out.println("5. eleman : " + mesaj.charAt(4));

		System.out.println(mesaj.concat(" Yaşasın!"));
		// System.out.println(mesaj);

		// B ile başlıyorsa true örneğin A ile başlıyor mu diye sorarsak false olur
		System.out.println(mesaj.startsWith("B"));

		// hangisi ile bittiğinide endWith ile sorgulayabilirz
		System.out.println(mesaj.endsWith("."));

		// karakterleri al
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);

		/*
		 * verilen ifadeyi soldan aramaya başlar ve kaçıncı oldugunu yazar. indexOf
		 * yöntemi, bir Stringde belirtilen ilk oluşumun( kelimeyse o kelimenin ilk
		 * kullanıldıgı konuma kadar, karakterse karakterin ilk kullanıldığı yere kadar)
		 * konumunu döndürüyor
		 */

		System.out.println(mesaj.indexOf("a"));
		/*
		 * lastIndexOf yöntemi bir sitringde beliritlen karakterlerin son oluşumunun
		 * (eğer kelimeyse o kelimenin son kullanıldığı konuma kadar,karakterse
		 * karakterin son kullanıldığı yere kadar) konumunu döndürüyor
		 */

		System.out.println(mesaj.lastIndexOf("a"));

		// replace yani yer değiştirmek
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		/*
		 * yukarıdakiyle aynı System.out.println(mesaj.replace(' ','-'));
		 */
		// System.out.println(mesaj);

		// burada 2 yazdık ve 2. indexten itibaren yazdı( yani geriden itibaren parçala)
		System.out.println(mesaj.substring(2));
		/*
		 * substring in diğer kullanımı ise istediğimiz indexe kadar kesebiliyoruz
		 * örneğin; System.out.println(mesaj.substring(2,5));
		 */

		// split içerisinde boşluğa göre ayır diyoruz
		// "" bu şekilde harf harf sıralanıyo " " boşluklu kelime kelime
		for (String kelime : mesaj.split(" ")) {

			System.out.println(kelime);
		}
		// toLowerCase kelimelerin hepsini küçük harfe çevirir
		System.out.println(mesaj.toLowerCase());
		// toUpperCase kelimelerin hepsini büyük harfe çevirir
		System.out.println(mesaj.toUpperCase());
		// trim fonksiyonu ile cümlenin başındaki ve sonundaki boşlukları atabiliyoruz
		System.out.println(mesaj.trim());

	}

}
