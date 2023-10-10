package pattern;

public class Program {

	public static void main(String[] args) {
		Program obj=new Program();
		/*obj.pattern1();	
		System.out.println();
		obj.pattern2();
		System.out.println();
		obj.pattern3();
		System.out.println();
		obj.pattern4();
		System.out.println();
		obj.pattern5();
		System.out.println();
		obj.pattern6();
		System.out.println();
		obj.pattern7();
		System.out.println();
		obj.pattern8();
		System.out.println();*/
		//obj.pattern9();
		//System.out.println();
		//obj.pattern10();
		//System.out.println();
		//obj.pattern11();
}

	private void pattern11() {
		for(int row=1;row<=7;row++) {
			for(int col=1;col<=7;col++) {
				if(row==1 || row==7 ||row==4 || (row<=4 && col==1)||(row>4 && col==7 )) {
					System.out.print("* ");
				}else
					System.out.print("  ");
			}System.out.println();
		}
			
		
	}

	private void pattern10() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5;col++) {
				if(row==1 || col==1 || row==5 || row==3 || row==4 && col==5) {
					if(row==3 && col==2) {
						System.out.print("  ");
					}else
					System.out.print("* ");
				}else
					System.out.print("  ");
			}System.out.println();
		}
		
	}

	private void pattern9() {
		for(int row=1;row<=8;row++) {
			for(int col=1;col<=8;col++) {
				if(row==1 || row==7 || col==1 || col==7 || row==6 && col==6 || row==8 && col==8) {
					if(row==1 && col==1 || row==1 && col==7 || col==1 && row==7 || row==1 && col==8 || col==1 && row==8 || row==8 && col==7 || row==7 && col==8 ) {
						System.out.print("  ");
					}else 
						System.out.print("* ");
					
				}else 
					System.out.print("  ");
				
			}
			System.out.println();
		}
		
	}

	private void pattern8() {  
		int no=10;
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=row;col++) {
			System.out.print(no+" ");
			no--;
		}
		System.out.println();
		}
	}

	private void pattern7() {
		for(int row='A';row<='I';row+=2) {
			for(int col=row;col<='I';col+=2) {
				System.out.print((char)col+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern6() {
		for(int row=1;row<=7;row++) {
			for(int col=1;col<=7;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private void pattern5() {
		for(int row=1;row<=5;row++) {
			for(int col=5;col>row;col--) {
				System.out.print("  ");
			} 
			for(int no=1;no<=row;no++) {
				System.out.print(no+" ");
			}
			System.out.println();
		}
		
		
	}

	private void pattern4() {
		for(int row=5;row>=1;row--) {
			for(int col=5;col>row;col--) {
				System.out.print("  ");
			} 
			for(int no=1;no<=row;no++) {
				System.out.print(no+" ");
			}
			System.out.println();
		}
		
		
	}

	private void pattern3() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<row;col++) {
				System.out.print("  ");
			} 
			for(int no=row;no<=5;no++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
		
		
	}

	private void pattern2() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<row;col++) {
				System.out.print("  ");
			} 
			for(int no=row;no<=5;no++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		
	}

	private void pattern1() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<row;col++) {
				System.out.print("*" +" ");
			} 
			for(int no=row;no<=5;no++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}
		
	}

}

