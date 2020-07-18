package com.edu.thread;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Philosopher implements Runnable {

	private String name;

	private Chopstick left;

	private Chopstick right;

	public Philosopher(String name, Chopstick left, Chopstick right) {
		super();
		this.name = name;
		this.left = left;
		this.right = right;
	}

	private void think() throws InterruptedException {
		TimeUnit.MILLISECONDS.sleep(new Random(5).nextInt(500));
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				System.out.println(this.name + " feels hungry");
				right.take();
				System.out.println(this.name + " picks up" + right);
				left.take();
				System.out.println(this.name + " picks up" + left);
				System.out.println(this.name + " is eating");
				think();
				System.out.println(this.name + " is thinking");
				right.drop();
				left.drop();
			}
		} catch (Exception e) {
			System.out.println(this.name + "exting via interrupt");
		}
		// 测试线程是否中断

	}

}
