package pattern;

public class Pattern1 {

	public static void main(String[] args) {
		Pattern1 obj=new Pattern1();
		/*obj.patternN();
		System.out.println();
		obj.patternE();
		System.out.println();
		obj.patternK();
		System.out.println();
		obj.patternDiamond();
		System.out.println();*/
		obj.patternheart();
		

	}

	private void patternheart() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==1 && row<4 || col==5 && row<4 || col==row-2 || col+row==8) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
		
	}System.out.println();
		}
	}

	private void patternDiamond() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==row-2 || row+col==4 || col==2+row || row+col==8) {
					System.out.print("* ");
				}else
					System.out.print("  ");
			}System.out.println();
		}
		
		
	}

	private void patternK() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==1 || row+col==5 || col==row-1 ) {
					System.out.print("* ");
				}else
					System.out.print("  ");
			}System.out.println();
		}
		
	}

	private void patternE() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==1 || row==5 || row==3 || col==1) {
					System.out.print("* ");
				}else
					System.out.print("  ");
			}System.out.println();
		}
		
	}

	private void patternN() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(col==1 || col==5 || row==col) {
					System.out.print("* ");
				}else
					System.out.print("  ");
			}System.out.println();
		}
		
	}

}

