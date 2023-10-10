package learn_array;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		ExceptionDemo1 ecp=new ExceptionDemo1();
		int[] br= {99,80,90,100};
		try {
			ecp.display(br);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("index out of bound");
		}

	}
}
