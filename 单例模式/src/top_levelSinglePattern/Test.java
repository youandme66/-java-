package top_levelSinglePattern;

public class Test {
	public static void main(String[] args) {
		SynchronizedSingleton a=SynchronizedSingleton.getInstance();
		System.out.println(a.a+a.b);
		a.setA(6);
		a.setB("cao");
		System.out.println(a.a+a.b);
	}
}
