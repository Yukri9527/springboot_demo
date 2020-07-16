package demo;

public class Philosopher {

	private String[] name = { "A", "B", "C", "D" };

	private Chopstick left;

	private Chopstick right;

	private Integer thinkFactor;

	public void think() {
		try {
			Thread.sleep(500);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void run() {
		while (!Thread.interrupted()) {
				
			 //TODO 右⼿拿筷⼦
			 //TODO 左⼿拿筷⼦
			 //sout(this.name + " is eating”)
			 //思考 think()
			 //TODO 放下右筷⼦
			 //TODO 放下左筷⼦
			}
	}

}
