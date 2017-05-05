package factoryClass;

public class BuldCreator implements Creator {
	public Light createLight() {
		return new BuldLight();
	}
}
