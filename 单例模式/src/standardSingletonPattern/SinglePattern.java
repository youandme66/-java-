package standardSingletonPattern;

public class SinglePattern {
	private static SinglePattern singleton;
	private SinglePattern(){}
	public static SinglePattern getInstance(){
		if(singleton==null){
			singleton=new SinglePattern();
		}
		return singleton;
	}
	int a=3;
	String b=new String("wode");
	public void setA(int a){
		this.a=a;
	}
	public void setB(String b){
		this.b=b;
	}
}
