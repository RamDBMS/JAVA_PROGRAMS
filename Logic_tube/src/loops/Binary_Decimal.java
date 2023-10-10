
package loops;

public class Binary_Decimal {

	public static void main(String[] args) {
		Binary_Decimal bd=new Binary_Decimal();
		bd.split_digit(1111);

	}

	public void split_digit(int binary) {
		int p=0;
		int decimal=0;
		while(binary>0) {
			int rem=binary%10;
			int result=rem*find_power(2,p);
			System.out.println(result);
			p++;
			decimal=decimal+result;
			binary=binary/10;
		}
		System.out.println(decimal);
		
	}
	public int find_power(int base,int power) {
		int no=1;
		while(power>0) {
			no=no*base;
			power--;
		}
		//System.out.println(no);
		return no;
		
	}


}
