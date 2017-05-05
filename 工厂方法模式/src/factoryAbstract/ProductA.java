package factoryAbstract;

interface ProductA {
	void methodA();
}
interface ProductB{
	void methodB();
}
class ProductA1 implements ProductA{
	public void methodA(){
		System.out.println("产品A中的1方法");          
	}
}
class ProductA2 implements ProductA{
	public void methodA(){
		System.out.println("产品A中的2方法");
	}
}
class ProductB1 implements ProductB{
	public void methodB(){
		System.out.println("产品B中的1方法");
	} 
}
class ProductB2 implements ProductB{
	public void methodB(){
		System.out.println("产品B中的2方法");
	}
}
