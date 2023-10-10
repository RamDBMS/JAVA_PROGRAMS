
package multithread;

public class RunnableDemo implements Runnable {
	public void run() {
		 for(int i=0;i<=5;i++) {
			 System.out.println("The child thread:"+i);
		 }
	}

}
