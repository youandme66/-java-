package observe2;

import java.util.Observable;
import java.util.Observer;

public class Reader implements Observer{
	public String name;
	public Reader(String name){
		super();
		this.name=name;
	}
	public String getName(){
		return name;
	};
	public void subscribe(String writerName){
		WriterManager.getInstance().getWriter(writerName).addObserver(this);
	}
	public void unsubscrible(String writerName){
		WriterManager.getInstance().getWriter(writerName).deleteObserver(this);
	}
	public  void update(Observable o,Object  obj){
		if(o instanceof Writer){
			Writer writer=(Writer) o;
			System.out.println(name+"知道"+writer.getName()+"发布了新书《"+writer.getLastNovel()+"》，非要去看！");
		}
	}
}
