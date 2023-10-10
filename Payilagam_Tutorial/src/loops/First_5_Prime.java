
package loops;

public class First_5_prime {

	public static void main(String[] args) {
		First_5_prime pp=new First_5_prime();
		pp.find_prime(2);

	}

	public void find_prime(int no) {
		int div=2;
		int count=0;
		int prime_count=0;
		while(div<=no/2) {
			if(no%div==0) {
				count++;
				break;
			}
			div++;
			
		}if(count==0) {
			System.out.println(no+"prime");
			prime_count++;
			
		}if(prime_count<=5) {
			no++;
			find_prime(no);
		}
		
	}

}
