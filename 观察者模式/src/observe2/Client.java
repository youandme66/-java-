package observe2;

public class Client {
	public static void main(String[] args) {
		Reader r1=new Reader("谢广坤");
		Reader r2=new Reader("赵四");
		Reader r3 = new Reader("七哥");  
        Reader r4 = new Reader("刘能");  
        Writer w1 = new Writer("谢大脚");  
        Writer w2 = new Writer("王小蒙");
        r1.subscribe("谢大脚");
        r2.subscribe("谢大脚");
        r3.subscribe("谢大脚");
        r4.subscribe("谢大脚");
        r3.subscribe("王小蒙");
        r4.subscribe("王小蒙");
        w1.addNovel("设计模式");
        w2.addNovel("JAVA编程思想");
        r1.unsubscrible("谢大脚");
        w1.addNovel("观察者模式");
	}
}
