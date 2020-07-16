package demo;

public class Philosopher implements Runnable {

	public String[] ph = { "A", "B", "C", "D" };
	private int index;
	public static Chopstick chop = new Chopstick();

	public Philosopher(int index) {
		this.index = index;
	}

	

	public synchronized void thinking() {
		int index = toInt(Thread.currentThread().getName());;
		System.out.println("哲学家" + ph[index] + "在思考");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void eating() {
		System.out.println("哲学家" + ph[index] + "在吃饭");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// 拿起筷子-> 吃饭-> 放下筷子-> 思考
		while (true) {
			chop.takeChopsticks(index); // p操作
			eating();
			chop.putChopsticks(index); // v操作
			thinking();
		}
	}
	
	// 字符串转化
	public int toInt(String index) {
		int result = 0;
		if (index.equals(0)) {
			result = 0;
		}
		if (index.equals(1)) {
			result = 1;
		}
		if (index.equals(2)) {
			result = 2;
		}
		if (index.equals(3)) {
			result = 3;
		}
		return result;
	}
}
