package thread.exp;
/*
 * Threads allows a program to operate more efficiently by doing multiple things at the same time.
 * 
 * Threads can be used to perform at the same time.
 * 
 * Creating a Thread:
 * It can be created by extending the Thread class and overriding its run() method.
 */
public class TestThread1 extends Thread {
	public static int amount =0;
	public void run(){
		System.out.println("Start thread: "+amount);
		amount++;
		System.out.println("This code is running in a thread.: "+amount);
	}

	public static void main(String[] args) {
		TestThread1 thread = new TestThread1();
		thread.start();
//		System.out.println("This code is outside of the thread class."+amount);
//		String result=thread.toString();
//				//.getName();
//		System.out.println(result);
//		amount++;
//		System.out.println(amount);
		
	    // Wait for the thread to finish
	    while(thread.isAlive()) {
	    	amount++;
	      System.out.println("Waiting...: "+amount);
	    }
	    // Update amount and print its value
	    System.out.println("Running in Main: " + amount);
	    amount++;
	    System.out.println("Running Main: " + amount);

	}

}
