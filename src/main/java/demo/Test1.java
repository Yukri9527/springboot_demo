package demo;

public class Test1 {
	public static void main(String[] args) {
		SharedObj o = new SharedObj();
		MyThread mt = new MyThread(o);
		mt.start();
		MyThread mt2 = new MyThread(o);
		mt2.start();
	}
	//两个线程申请资源冲突 非有序申请到资源 导致结果混乱
}
