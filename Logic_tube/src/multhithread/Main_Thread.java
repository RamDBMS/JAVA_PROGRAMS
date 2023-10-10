package multithread;

public class Main_Thread {

	public static void main(String[] args) {
		
		Thread_Demo obj=new Thread_Demo();
		obj.start();
		for(int i=1;i<=5;i++) {
			 System.out.println("The Main_thread:"+i);
		}
				

	}

}

