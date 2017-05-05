package observe2;

import java.util.Observable;

public class Writer extends Observable{
	private String name;
	private String lastNovel;
	public Writer(){};
	public Writer(String name){
		super();
		this.name=name;
		WriterManager.getInstance().add(this);
	}
	public void addNovel(String novel){
		System.out.println(name+"发布了新书《"+novel+"》!");
		lastNovel=novel;
		setChanged();
		notifyObservers();
	}
	public String getLastNovel(){
		return lastNovel;
	}
	public String getName(){
		return name;
	}
}
