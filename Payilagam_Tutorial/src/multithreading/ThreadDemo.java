package multithreading;

 class ThreadDemo  {

 public static synchronized void display () {
	 Thread th=Thread.currentThread();
	 
	 for(int i=1;i<=5;i++) {
	 System.out.println(th.getName()+":"+i);
	 try {
		 Thread.sleep(100);
	 }catch (Exception e) {
		e.printStackTrace();
	}
	
 }
 }
 class Thread1 extends Thread{
	
	@Override
 public void run() {
		ThreadDemo.display();
	
 }
}
 class Thread2 extends Thread{
		
		@Override
	 public void run() {
		 ThreadDemo.display();
		
	 }
	}
 public class MainThread {

		public static void main(String[] args) {
			/*ThreadDemo demo = new ThreadDemo();
			Thread1 one = new Thread1 ();
			Thread2 two = new Thread2 ();
			
			one.start();
			two.start();*/
			
			
			

		}

	}

}

