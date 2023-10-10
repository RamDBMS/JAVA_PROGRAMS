package multithread;

public class Runnable_Demo1 {

	public static void main(String[] args, Runnable RunnableDemo) {
		RunnableDemo obj=new RunnableDemo();
		Thread thread=new Thread(RunnableDemo);
		thread.start();
		for(int i=0;i<=5;i++) {
			 System.out.println("The Main thread:"+i);
		 }
		
	}

}

