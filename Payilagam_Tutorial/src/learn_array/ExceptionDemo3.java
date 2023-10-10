package learn_array;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		ExceptionDemo3 ecp = new ExceptionDemo3();
		int[] ar= {90,89,100,80,98};
		try {
			ecp.display(ar);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	public void display(int[] ar) throws Exception {
		for(int i=0;i<5;i++) {
			System.out.println(ar[i]);
		}
		

	}

}

