package exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		ExceptionDemo2 f1=new ExceptionDemo2();
		ExceptionDemo2 f2=new ExceptionDemo2();

		f1=null;
		f2=null;
		
		System.gc();

	}
	protected void finalize() throws Throwable { //this method is used for clean up
		System.out.println("clean all");
	}

}
