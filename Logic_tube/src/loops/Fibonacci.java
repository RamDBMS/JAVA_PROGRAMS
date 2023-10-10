
package loops;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci fibo=new Fibonacci();
		fibo.print_fibo(0,1);
		
	}

	public void print_fibo(int first, int second) {
		int third=0;int count=0;
		while(true) {
			if(count<10) {
			System.out.println(first);
			third=first+second;
			first=second;
			second=third;
			count++;
		}
		}
	}

}
