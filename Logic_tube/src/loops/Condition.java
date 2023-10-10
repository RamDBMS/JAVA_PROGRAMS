package loops;

public class Condition {

	public static void main(String[] args) {
		Condition cd=new Condition();
		//cd.display();
		//cd.CD();
		//cd.GCD();
		cd.LCM();
		
	}	
	private void LCM() {
		int no1=20;
		int no2=15;
		int big=no1>no2?no1:no2;
		int div=2;
		while(true) {
			if(big%no1==0 && big%no2==0) {
				System.out.println(big);
				break;
			}
			big++;
		}
		
	}
	private void GCD() {
		int no1=100;
		int no2=60;
		int small=no1<no2?no1:no2;
		int div=2; int gcd=0;
		while(div<=small) {
			if(no1%div==0 && no2%div==0) {
				gcd=div;
			}
			div++;
		}if(gcd!=0) {
			System.out.println(gcd);
		}else {
			System.out.println("not have common divisor");
		}
		
	}
	private void CD() {
		int no1=100;
		int no2=60;
		int small=no1<no2?no1:no2;
		int div=2;
		while(div<=small) {
			if(no1%div==0 && no2%div==0) {
				System.out.println(div);
			}
			div++;
		}
		
	}
	private void display() {
		int no=1;
		for(;no<=6;no++) {
			System.out.println(no);
		}
		System.out.println("hello"+no);

	}

}
