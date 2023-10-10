
package loops;

public class Fibo_without_3rdvar {

	public static void main(String[] args) {
		Fibo_without_3rdvar fibo1=new Fibo_without_3rdvar();
		fibo1.print_fibo1(0,1);
		
	}

	public void print_fibo1(int first, int second) {
	
			while(first<=13) {
			System.out.println(first);
			//int third=first+second;
			second=second+first;
			first=second-first;
			
		
		}

	}

}

