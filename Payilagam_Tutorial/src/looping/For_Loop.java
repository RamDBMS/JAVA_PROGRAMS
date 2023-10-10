
package looping;

public class For_loop {

	public static void main(String[] args) {
		For_loop obj=new For_loop();
		//obj.print();
		//obj.pattern();
		//obj.pattern1();
		//obj.pattern2();
		//obj.pattern3();
		//obj.pattern4();
		//obj.pattern5();
		//obj.pattern6();
		obj.pattern7();
		//obj.pattern8();
		//obj.pattern9();
		//obj.pattern10();
		
	}
	public void print() {             //1 2 3 4 5
		for(int i=1;i<=5;i++) {
			System.out.print(i);
		}
	}
    public void pattern() {               //1 1 1 1 1
    	for(int row=1;row<=3;row++) {     //2 2 2 2 2
    		                              //3 3 3 3 3
    	for(int col=1;col<=5;col++) {
    		System.out.print(row+" ");
    	}
    	System.out.println();
    	}
    }
    public void pattern1() {
    	for(int row=5;row>=1;--row) {   //5 5 5 5 5
    	for(int col=1;col<=5;col++) {   //4 4 4 4 4
    		System.out.print(row+" ");  //3 3 3 3 3
    	}                               //2 2 2 2 2
    	System.out.println();           //1 1 1 1 1
    	}
    }
    public void pattern2() {              // 1 2 3 4 5   
    	for(int row=1;row<=3;row++) {     // 1 2 3 4 5
    	for(int col=1;col<=5;col++) {     // 1 2 3 4 5
    		System.out.print(col+" ");
    	}
    	System.out.println();
    	}
    }
    public void pattern3() {              //1 2 3 4 5
    	                                  //6 7 8 9 10 
    	for(int col=1;col<=5;col++) {     
    		System.out.print(col+" ");
    	}
    	System.out.println();
    		for(int col1=6;col1<=10;col1++) {  	
    		     System.out.print(col1+" ");
    		}
    	System.out.println();
    	}
    public void pattern4() {              //1 2 3 4 5   
    	for(int row=5;row>=1;row--) {     //1 2 3 4 
    	for(int col=1;col<=row;col++) {   //1 2 3  
    		System.out.print(col+" ");    //1 2 
    	}                                 //1 
    	System.out.println();
    	}
    }
    public void pattern5() {            //5 4 3 2 1 0
    	for(int row=5;row>=0;row--) {   //5 4 3 2 1 0
    	for(int col=5;col>=0;col--) {   //5 4 3 2 1 0
    		System.out.print(col+" ");  //5 4 3 2 1 0
    	}                               //5 4 3 2 1 0
    	System.out.println();
    }
    }
    public void pattern6() {             //5 4 3 2 1
    	for(int row=1;row<=5;row++) {    //5 4 3 2 
    	for(int col=5;col>=row;col--) {  //5 4 3
    		System.out.print(col+" ");   //5 4
    	   }                             //5
    	System.out.println();
    }
    }
    public void pattern7() {             // 1 2 3 4 5
    	for(int col=1;col<=15;col++) {   // 6 7 8 9 10
    		System.out.print(col+" ");   // 11 12 13 14 15
    		if(col%5==0) {
    			System.out.println();
    		}
    	}
    
    }
    public void pattern8() {                 //10 8 6 4 2
    	for(int row=2;row<=10;row=row+2) {   //10 8 6 4
    	for(int col=10;col>=row;col=col-2) { //10 8 6
    		System.out.print(col+" ");       //10 8
    	}                                    //10
    	System.out.println();
    	}
    	
    }
    public void pattern9() {
    	int row=1; //for(int row=1;row<=5;row++)  //1 2 3 4 5
    	while(row<=5) {                           //2 3 4 5
    	for(int col=row;col<=5;col++) {           //3 4 5
    		System.out.print(col+" ");            //4 5
    }                                             //5
    	row++;
    		System.out.println();
    }
    }
    public void pattern10() {                 // 2 4 6 8 10
    	for(int col=2;col<=10;col+=2) {       // 1 3 5 7 9
    		System.out.print(col+" ");
        if(col==10) {
        	System.out.println();
        	col=-1;
        }
    	}
    }
}
