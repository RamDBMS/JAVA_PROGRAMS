package learn_array;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		ExceptionDemo1 ecp = new ExceptionDemo1();
		int[] ar= {90,89,100,80,98};
		ecp.display(ar);	

	}

	public void display(int[] ar) throws ArrayIndexOutOfBoundsException {
		for(int i=0;i<5;i++) {
			System.out.println(ar[i]);
		}
		
	}

}

