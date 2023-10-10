package looping;

public class Pattern4 {

	public static void main(String[] args) {
		Pattern4 obj=new Pattern4();
		obj.pattern();
		obj.pattern1();
		obj.pattern2();
		obj.pattern3();
		obj.pattern4();
		obj.pattern5();  

	}
	public void pattern() {
		int n=5;
		for(int row=1;row<=n;row++) {
			for(int col=row;col<=n;col++) {
				System.out.print(1+" ");
			}System.out.println();
		}
		
	}
	public void pattern1() {
		int n=5;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(1+" ");
			}System.out.println();
		}
		
	}
	public void pattern2() {
	
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=row;col++) {
				if(row<=5) {
				System.out.print(col+" ");
				}else 
					if (col<=10-row) {
					System.out.print(col+" ");
					}
			}System.out.println();
		}
		
	}
	public void pattern3() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
						System.out.print("* ");
					
			}System.out.println();
	}

		
	}
	public void pattern4() {
		int p=4;
		for(int row=1;row<=4;row++,p=p+2) {
			for(int col=1;col<=row;col++) {
				System.out.print(p+" ");
			}System.out.println();
		}
	}
	public void pattern5() {
		int n=5,k=1;
		for(int row=1;row<=n;row++) {
			for(int col=row;col>row;col--) {
				System.out.print("  ");
			}if(k<=row) {
				System.out.print("*  ");
				k++;
			}
		}
		System.out.println();
	}
}

