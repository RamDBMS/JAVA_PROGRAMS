
package multithreading;

public class ThreadChild1 {

	public static void main(String[] args) {
		ThreadChild tc = new ThreadChild ();
		  tc.start();
		  System.out.println(tc.getId());
		  System.out.println(tc.getName());
		  System.out.println(tc.getPriority());
		  System.out.println(tc.isDaemon());
		  System.out.println(tc.isAlive());
		  
		  ThreadChild tc1 = new ThreadChild ();
		  tc1.start();
		  System.out.println(tc1.getId());
		  System.out.println(tc1.getName());
		  System.out.println(tc1.getPriority());
		  System.out.println(tc1.isDaemon());
		  System.out.println(tc1.isAlive());
	
		  for(int no=1;no<=5;no++) {
			  System.out.println("Threadchild1"+no);
		  }
		  
	}

}
