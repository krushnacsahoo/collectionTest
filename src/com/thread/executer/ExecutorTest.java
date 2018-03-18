package com.thread.executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExecutorTest {

	public static void main(String[] args) {

		for (int i = 0; i < 2; i++) {

			ExecutorService executor = Executors.newCachedThreadPool();
			Task task = new Task();
			executor.submit(task);
			executor.submit(task);
			executor.submit(task);
			executor.submit(task);
			executor.submit(task);
			executor.submit(task);
			executor.submit(task);
			executor.submit(task);
			executor.submit(task);
			executor.submit(task);
			executor.submit(task);
			executor.shutdown();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" Counter :" + i);
			if(task.getCounter() != 1100)
				System.out.println("Final Counter :" + task.getCounter());
		}
	}

}

class Task implements Runnable {

	int counter = 0;

	 Lock lock = new ReentrantLock();
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " start --  Counter is :" + counter);
		for (int i = 0; i < 100; i++) {

			 lock.lock();
			try {
				increament();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				 lock.unlock();
			}

		}

		System.out.println(Thread.currentThread().getName() + " finished --  Counter is :" + counter);
	}

	void increament() throws InterruptedException {
		// Thread.sleep(20);
		counter++;
	}

	int getCounter() {
		return counter;
	}
}