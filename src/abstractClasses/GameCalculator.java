package abstractClasses;

public abstract class GameCalculator {
	//abstractlar tek başına kullanılamaz
	public abstract void hesapla();

	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}

}
