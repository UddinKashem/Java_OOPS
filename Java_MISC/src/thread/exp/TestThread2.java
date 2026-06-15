package thread.exp;

/*
 * Create a thread is to implement the Runnable interface.
 */

public class TestThread2 implements Runnable {

	public void run(){
		System.out.println("This code is running in a thread.");
	}
	
	public static void main(String[] args) {
		TestThread2 obj = new TestThread2();
		Thread thread = new Thread(obj);
		thread.start();
		
		System.out.println("This code is outside of the thread.");

	}

}
