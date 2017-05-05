package top_levelSinglePattern;

public class SynchronizedSingleton {
	private static SynchronizedSingleton synchronizedSingleton;
	private SynchronizedSingleton(){}
	public static SynchronizedSingleton getInstance(){
		if(synchronizedSingleton==null){
			synchronized(SynchronizedSingleton.class){
				if(synchronizedSingleton==null){
					synchronizedSingleton=new SynchronizedSingleton();
				}
			}
		}
		return synchronizedSingleton;
	}
	int a=3;
	String b= new String("wode");
	public void setA(int a){
		this.a=a;
	}
	public void setB(String b){
		this.b=b;
	}
}

