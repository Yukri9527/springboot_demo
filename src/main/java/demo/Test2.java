package demo;

public class Test2 {
	public static void main(String[] args) {
		// SharedObj o = new SharedObj();
		SharedObj o = new Sync_SharedObj(); //  父类的实例化？
		MyThread mt = new MyThread(o);
		mt.start();
		MyThread mt2 = new MyThread(o);
		mt2.start();
	}
}
//  由于Sync_SharedObj() 继承了SharedObj() 继承关系是互斥资源？所以导致资源有序使用 
// 进而得到了有序输出的结果