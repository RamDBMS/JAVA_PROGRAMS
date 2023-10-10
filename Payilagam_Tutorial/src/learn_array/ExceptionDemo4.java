package learn_array;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		ExceptionDemo3 ecp=new ExceptionDemo3();
		int[] br= {99,80,90,100};
		try {
			ecp.display(br);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}

