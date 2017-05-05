package cenue1;

public class Myclass { 
		  
	    public void myMethod(MyInterface myInterface ){  
	        System.out.println("方法里的代码");  
	        //LZ想在这插入一段代码，而且这个代码是可以改变的，想怎么变就怎么变  
	        myInterface.insertCode();
	        System.out.println("方法里的代码");
	} 
}
