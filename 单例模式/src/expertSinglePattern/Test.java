package expertSinglePattern;

public class Test {
	public static void main(String[] args) {
		BadSynchronizedSingleton a=BadSynchronizedSingleton.getInstance();
		System.out.println(a.a+a.b);
		a.setA(6);
		a.setB("cao");
		System.out.println(a.a+a.b);
	}
}
