package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator= new ProductValidator(); - static yapmadan önce
		if(ProductValidator.İsValid(product)) {
			System.out.println("Eklendi.");
		}else {}
		System.out.println("Ürün bilgileri geçersizdir.");
		
	}
	//yapıcı bloklar new lyince çalışır
	

}
