package demo;

public class Chopstick {
	
	public boolean[] isUsing = new boolean[4];
	public String[] ph= {"A","B","C","D"};
	public synchronized void takeChopsticks(int index) {
		while (isUsing[index] && isUsing[(index + 1) % 4]) { // 左右手资源同时存在才拿起筷子
			try {
				wait(); // 等待eat响应
			} catch (InterruptedException e) {
				// 拿起筷子  准备吃饭
				e.printStackTrace();
			}
		}
		isUsing[index] = true;
		isUsing[(index + 1) % 4] = true;  // 左手与右手的筷子
		System.out.println("哲学家" + ph[index] + "拿起筷子");
	}

	public synchronized void putChopsticks(int index) {
		isUsing[index] = false;
		isUsing[(index + 1) % 4] = false;
		System.out.println("哲学家" + ph[index] + "放下筷子");
		notify(); // 释放筷子资源
		// 吃完后 放下筷子
	}
}

//考虑不造成死锁  设置互斥信号量isUsing t,f 来避免死锁的发生