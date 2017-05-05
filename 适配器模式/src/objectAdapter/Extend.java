package objectAdapter;

public class Extend extends Athlete{
	public Extend(String Name, String Number, int Speed, int Accelaration) {
		super(Name, Number, Speed, Accelaration);
	}
	Extension a= new Extension();
	public void print(){
		a.print(Name, Number, Speed, Accelaration);
	}
}
