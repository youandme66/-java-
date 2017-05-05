package factoryClass;

public class TubeCreator implements Creator {
	public Light createLight() {
		return new TubeLight();
	}

}
