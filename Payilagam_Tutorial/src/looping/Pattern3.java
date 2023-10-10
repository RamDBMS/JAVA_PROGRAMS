package looping;

public class Pattern3 {

	public static void main(String[] args) {
		Pattern3 obj=new Pattern3();
		//obj.pattern();
		//obj.pattern1();
		//obj.pattern2();
		obj.pattern3();

	}
	public void pattern() {
		for(int row='A';row<='E';row++) {
			for(int col='E';col>=row;col--) {
				System.out.print((char)col+" ");
			}
			System.out.println();
		}
		
	}
	public void pattern1() {
		for(int row='A';row<='E';row++) {
			for(int col='E';col<=row;col++) {
				System.out.print((char)col+" ");
			}
			System.out.println();
		}
	}
	public void pattern2() {
		char ch='A';
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
	public void pattern3() {
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=row;col++) {
				if(row<=5) {
					System.out.print(col+" ");
				}else
					if(col<=10-row) {
						System.out.print(col+" ");
					}
				
			}
			System.out.println();
		}
		
	}
	

}

