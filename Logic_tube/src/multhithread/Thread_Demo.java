package multithread;

public class Thread_Demo extends Thread {
	
	public void run() {
	 for(int i=0;i<=5;i++) {
		 System.out.println("The child thread:"+i);
	 }
	}
	

}

