package demos;

public class loopfor {
	public static void main(String[] args) {
		// for
		// i++ tek sıralı
		// i+=2 tek sayıları yazar
		// i=0 ya da 2 vs yaparsakta çift sayıları yazar
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);

		}

		System.out.println("For döngüsü bitti");

		// While
		int i = 2;
		while (i < 10) {

			System.out.println(i);
			i += 2;
		}
		System.out.println("While döngüsü bitti");

		// Do-While
		int j = 100;
		do {
			System.out.println(j);
			j += 2;

		} while (j < 10);
		System.out.println("Do-while döngüsü bitti");
	}
}
