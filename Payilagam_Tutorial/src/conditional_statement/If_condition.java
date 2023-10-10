package conditional_statement;

public class If_Condition {

	public static void main(String[] args) {
		If_Condition ip=new If_Condition();
		ip.match();		
		ip.add(5);

	}

	private void match() {
		int india=90;
		int pakistan=90;
		if(india>pakistan)
		{
			System.out.println("india won the match");
		}
		else if(pakistan>india)
		{
			System.out.println("pakistan won the match");
		}
		else 
		{
			System.out.println("match tie");
		}
	}
		public void add(int no) {
			System.out.println(no);
			no--;
			if(no>0) {
				add(no);
			}
		
	
		
	}

}

