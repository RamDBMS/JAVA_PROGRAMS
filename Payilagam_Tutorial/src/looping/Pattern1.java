
package looping;

public class Pattern1 {

	public static void main(String[] args) {
		Pattern1 obj=new Pattern1();
		obj.pattern1();
		obj.pattern2();
		obj.pattern3();
		obj.pattern4();
		obj.pattern5();
		obj.pattern6();

	}
	public void pattern1() {
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public void pattern2() {
		for(int row=1;row<=4;row++) {
           for(int col=row;col<=4;col++) {
			System.out.print(" * ");
			}
           System.out.println();
		}
	}
    public void pattern3() {
    	for(int row=1;row<=4;row++) {
    	for(int col=1;col<=row;col++) {
    		System.out.print("   ");
    	}
    	for(int col=row;col<=4;col++) {
    		System.out.print(" * ");
    	}
    	System.out.println();
    	}
    	
    }
    public void pattern4() {
    	for(int row=1;row<=4;row++) {
    		for(int col=row;col<=4;col++) {
    			System.out.print("   ");
    		}
    		for(int col=1;col<=row;col++) {
    			System.out.print(" * ");
    		}
    		System.out.println();
    	}	
    }
    public void pattern5() {
    	for(int row=1;row<=4;row++) {
    		for(int col=1;col<row;col++) {
    			System.out.print("   ");
    		}
    		for(int col=row;col<4;col++) {
    			System.out.print(" * ");
    		}
    		for(int col=row;col<=4;col++) {
    			System.out.print(" * ");
    		}
    		System.out.println();
    	}
    }
    public void pattern6() {
    	for(int row=1;row<=4;row++) {
    		for(int col=row;col<=4;col++) {
    			System.out.print("   ");
    		}
    		for(int col=1;col<row;col++) {
    			System.out.print(" * ");
    		}
    		for(int col=1;col<=row;col++) {
    			System.out.print(" * ");
    		}
    		System.out.println();
    	}
    }
}
