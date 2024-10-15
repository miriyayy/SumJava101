package demosPolymorphism;

public class Filelogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Logged to file : "+ message);
	}
}
