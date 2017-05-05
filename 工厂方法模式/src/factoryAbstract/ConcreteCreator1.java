package factoryAbstract;

public class ConcreteCreator1 implements Creator {
	public ProductA createProductA(){
		return new ProductA1();
	}
	public ProductB createProductB(){
		return new ProductB1();
	}
}
