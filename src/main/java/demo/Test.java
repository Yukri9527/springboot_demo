package demo;

public class Test {
	public static void main(String[] args) {
		
		Philosopher p1 = new Philosopher(0);
		Philosopher p2 = new Philosopher(1);
		Philosopher p3 = new Philosopher(2);
		Philosopher p4 = new Philosopher(3);

		new Thread(p1, "0").start();
		new Thread(p2, "1").start();
		new Thread(p3, "2").start();
		new Thread(p4, "3").start();

	}

}
