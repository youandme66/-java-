package standardSingletonPattern;

public class Test {
	public static void main(String[] args) {
		SinglePattern a=SinglePattern.getInstance();
		System.out.println(a.a+a.b);
		SinglePattern b=SinglePattern.getInstance();
		b.setA(6);
		b.setB("cao");
		System.out.println(a.a+a.b);
		System.out.println(b.a+b.b);
		
	}
}
