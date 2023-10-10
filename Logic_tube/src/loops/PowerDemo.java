package loops;

public class PowerDemo {

	public static void main(String[] args) {
		PowerDemo pd=new PowerDemo();
		
		int no=1;
		while(no<=5) {
			pd.find_power(no,3);
		no++;
		}

	}

	public void find_power(int base,int power) {
		int no=1;
		while(power>0) {
			no=no*base;
			power--;
		}
		System.out.println(no+" ");
		
	}

}

