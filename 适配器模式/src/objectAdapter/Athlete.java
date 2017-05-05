package objectAdapter;
import java.util.*;
public class Athlete {
	String Name;
	String Number;
	int Speed;
	int Accelaration;
	Date firstDate=new Date();
	int firstSeconds=firstDate.getSeconds();
	public Athlete(String Name,String Number,int Speed,int Accelaration){
		this.Name=Name;
		this.Number=Number;
		this.Speed=Speed;
		this.Accelaration=Accelaration;
	}
	public int currentSpeed(){
		Date secondDate=new Date();
		int secondSeconds=secondDate.getSeconds();
		Speed=Speed+Accelaration*(secondSeconds-firstSeconds);
		return Speed;
	}
}
