package classAdapter;
import java.util.*;
public class Car {
	String name;
	int wheel;
	int speed;
	int accelaration;
	Date firstDate = new Date();
	int firstSeconds=firstDate.getSeconds();
	public Car(int wheel,int speed,int accelaration){
		this.wheel=wheel;
		this.speed=speed;
		this.accelaration=accelaration;
	}
	public void print(){
		System.out.println("����:"+name+"����:"+speed+"������:"+wheel+"�����ٶ�:"+accelaration);
	}
	public int getSpeed(){
		Date secondDate=new Date();
		int secondSeconds=secondDate.getSeconds();
		speed=speed+accelaration*(secondSeconds-firstSeconds);
		return speed;
	}
}
