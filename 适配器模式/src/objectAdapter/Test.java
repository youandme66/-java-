package objectAdapter;

public class Test {
	public static void main(String[] args) {
		Extend a=new Extend("ÁõÏè","001",10,5);
		for(int i=0;i<10000;i++){
			int b=a.currentSpeed();
		    System.out.println(b);
		}
		
		a.print();
	}
}
