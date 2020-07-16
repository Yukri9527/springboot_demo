package demo;

public class Chopstick {

	public Integer id ;

	public boolean taken = false;

	public synchronized void take() throws InterruptedException {
		while (taken) {
			wait();
		}
		taken = true;
	}

	public synchronized void drop() {
		taken = false;
		notifyAll();
	}
	
}
// 若要考虑不造成死锁  可以考虑设置互斥信号量mutex 0，1 来控制死锁的发生