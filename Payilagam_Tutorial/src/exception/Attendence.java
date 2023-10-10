package exception;

public class attendence extends Exception{

	public static void main(String[] args) {
		attendence obj=new attendence();
		try {
		obj.display(35);
		}catch(attendence ae) {
			System.out.println("handle");
		}
		
	}

	public void display(int a) throws attendence {
		if(a<35) {
			System.out.println("pass");
		}else {
			throw new attendence();
		}
		
		
		
	}

}

