package classAdapter;

public class Extension1 extends Car implements Extension{
	public Extension1(int wheel, int speed, int accelaration) {
		super(wheel, speed, accelaration);
	}

	public boolean isOverspeed(){
		if(speed>=80){
			return true;
		}
		else
			return false;
	}
}
