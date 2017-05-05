package observe1;
import java.util.ArrayList;
import java.util.List;
public class Observable {
	List<Observer> observers=new  ArrayList<Observer>();
	public void addObserver(Observer o){
		observers.add(o);
	}
	public void changed(){
		System.out.println("我是被观察者，我已经发生变化");
		notyfyObservers();
	}
	public void notyfyObservers(){
		for(Observer observer:observers){
			observer.update(this);
		}
	}
}
