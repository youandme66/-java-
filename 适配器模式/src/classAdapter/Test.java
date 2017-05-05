package classAdapter;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Extension1 a=new Extension1(4,10,5);
		for(int i=0;i<200;i++){
		   int c=a.getSpeed();
		   System.out.println(c);
		   System.out.println(a.isOverspeed());
		}
	}

}
