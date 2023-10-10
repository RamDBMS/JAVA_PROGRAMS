
package looping;

public class Pattern {

	public static void main(String[] args) {
		Pattern obj=new Pattern();
		//obj.pattern1();
		//obj.patternV();		
        //obj.patternY();
		//obj.patternM();
		obj.patternW();
	}
	public void pattern1() {
		for(int row=1;row<=9;row++) {
		for(int no=1;no<=7;no++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	}
	public void patternV() {
		for(int row=1;row<=6;row++) {
			for(int col=1;col<=5;col++) {
				if(row<=3) {
					if(col==row || col==6-row) {
						System.out.print("* ");
					}
					else 
						System.out.print(" ");
					}
				
			}
			System.out.println();
		}
		
	}
	public void patternY() {
		for(int row=1;row<=6;row++) {
			for(int col=1;col<=5;col++) {
				if(row<=3) {
					if(col==row || col==6-row) {
						System.out.print("* ");
					}else
						System.out.print(" ");
				}else if(col==3) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}System.out.println();
		}
		
	}
	public void patternM() {
 		for(int row=1;row<=6;row++) {
			for(int col=1;col<=5;col++) {
				
				if(col==1 || col==5 ) {
					System.out.print(" * ");
				}
				
				else if(row<=3) {
					if(col==row || col==6-row ) {
						System.out.print(" * ");
					}
					else {
						System.out.print("   ");
					}
				}
				else
					System.out.print("   ");
				
			}
			System.out.println( );
		}
	}
	public void patternW() {
		for(int row=1;row<=6;row++) {
			for(int col=1;col<=5;col++) {
		    if(col==1 || col==5) {
		    	System.out.print(" * ");
		    }
		    else
		    	System.out.print("   ");
			}System.out.println();
		}
		
	}
}
