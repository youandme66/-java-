package perfectSingleton;

public class PerfectSingletonPattern {
	private PerfectSingletonPattern(){}
	public static PerfectSingletonPattern getInstancce(){
		return SingletonInstance.instance;
	}
	private static class SingletonInstance{
		volatile static PerfectSingletonPattern instance=new PerfectSingletonPattern();
	}
}
