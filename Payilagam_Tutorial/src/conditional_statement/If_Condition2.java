package conditional_statement;

public class If_Condition2 {

	public static void main(String[] args) {
		If_Condition2 obj=new If_Condition2();
		obj.marks(77,93);
	
	}
	public void marks(int A,int B) {
		if(A<=50) {
			System.out.println("B+ grade");
		}else if(A<=70) {
			System.out.println("A grade");
		}else if(A<=80) {
			System.out.println("A+ grade");
		}else {
			System.out.println("O grade");
		}
		if(B<=50) {
			System.out.println("B+ grade");
		}else if(B<=70) {
			System.out.println("A grade");
		}else if(B<=80) {
			System.out.println("A+ grade");
		}else {
			System.out.println("O grade");
		}
		if (A>=30 && B>=30)
			
		{
			System.out.println("both are pass");
			
		}else {
			System.out.println("both are fail");
		}
	}

}

