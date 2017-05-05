package expertSinglePattern;

public class BadSynchronizedSingleton {
	private static BadSynchronizedSingleton synchronizedSingleton;
	private BadSynchronizedSingleton(){}
	public synchronized static BadSynchronizedSingleton getInstance(){
		if(synchronizedSingleton==null){
		synchronizedSingleton=new BadSynchronizedSingleton();
		}
	return synchronizedSingleton;
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
