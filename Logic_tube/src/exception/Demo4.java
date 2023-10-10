
package exception;

public class Demo4 {

	public static void main(String[] args) {
		Demo4 f=new Demo4();
		f=null;
        System.gc();
	}
	protected void finalize() {
		System.out.println("deleted");
	}

}
