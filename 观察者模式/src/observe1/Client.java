package observe1;

public class Client {
	public static void main(String[] args) {
		Observable observable=new Observable();
		observable.addObserver(new ConcreteObserver1());//添加观察者1
		observable.addObserver(new ConcreteObserver2());//添加观察者2
		observable.changed();                           //被观察者改变
	}
}
