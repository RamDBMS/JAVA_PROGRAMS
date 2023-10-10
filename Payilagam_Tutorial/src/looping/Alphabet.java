package looping;

public class Alphabet {

	public static void main(String[] args) {
		Alphabet obj=new Alphabet();
		//obj.patternA();
		//obj.patternB();
		//obj.patternC();
		//obj.patternD();
		//obj.patternE();
		//obj.patternF();
		//obj.patternG();
		//obj.patternH();
		//obj.patternI();
		//obj.patternJ();
		//obj.patternK();
		//obj.patternL();
		//obj.patternM();
		//obj.patternN();
		//obj.patternO();
		//obj.patternP();
		//obj.patternQ();
		//obj.patternR();
		//obj.patternS();
		//obj.patternT();
		//obj.patternU();
		
		obj.patternV();
		//obj.patternW();
		//obj.patternX();
		//obj.patternY();
		//obj.patternZ();
		
	}
    public void patternA() {
    	for(int row=1;row<=5;row++) {
    		for(int col=1;col<=5;col++) {
    		if(col==1 || col==5 || row==1 || row==3) {
    			if(row==1 && col==1 || row==1 && col==5) {
    			System.out.print("  ");
    			}else
    				System.out.print("* ");
    		}else {
    			System.out.print("  ");
    		}
    		}
    		
    		System.out.println();
    		
    	}
    	
    }
    public void patternB() {
    for(int row=1;row<=5;row++) {
    	for(int col=1;col<=5;col++) {
    		if(col==1 || row==1 || row==3 || row==5 || row==2 && col==5 || row==4 && col==5) {
    			if(row==1 && col==5 || row==3 && col==5 || row==5 && col==5) {
    			System.out.print("   ");
    			
    		}else 
    			System.out.print("* ");
    		}else {
    			System.out.print("  ");
    		}
    	}
    	System.out.println();
    }
    	
    }
    public void patternC() {
    	for(int row=1;row<=5;row++) {
    		for(int col=1;col<=5;col++) {
    			if(row==1 || row==5 || col==1) {
    				if(row==1 && col==1 || row==5 && col==1) {
    				System.out.print("  ");
    				}else {
    					System.out.print("* ");
    				}
    			}
    		}
    		System.out.println();
    	}
    }
    public void patternD() {
    	for(int row=1;row<=5;row++) {
    		for(int col=1;col<=5;col++) {
    		 if(col==1 || row==1 || row==5 || col==5) {
    			 if(row==1 && col==5 || row==5 && col==5) {
    				 System.out.print(" ");
    			 }else 
    				 System.out.print("* ");
    			 }else 
    				 System.out.print("  ");
    			 
    		 }
    		System.out.println();
    		}
    		
    	}
    public void patternE() {
    	for(int row=1;row<=5;row++) {
    		for(int col=1;col<=5;col++) {
    			if(row==1 || col==1 || row==3 || row==5) {
    				System.out.print("* ");
    			}
    		}
    	System.out.println();
    }
    	
    } 
    
    public void patternF() {
    	for(int row=1;row<=6;row++) {
    		for(int col=1;col<=5;col++) {
    			if(col==1 || row==1 || row==3) {
    				System.out.print("* ");
    			}
    		}System.out.println();
    		}
    }
    public void patternG() {
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
    public void patternH() {
    	for(int row=1;row<=5;row++) {
    		for(int col=1;col<=5;col++) {
    		if(col==1 || col==5 || row==3) {
    			System.out.print("* ");
    		}else
    			System.out.print("  ");
    		}System.out.println();
    		}
    }
    public void patternI() {
    	for(int row=1;row<=5;row++) {
    		for(int col=1;col<=5;col++) {
    			if(col==3) {
    				System.out.print("* ");
    			}else
    				System.out.print("  ");
    		}System.out.println();
    		}
    }
    public void patternJ() {
    	for(int row=1;row<=5;row++) {
    		for(int col=1;col<=5;col++) {
    			if(col==3 || row==4 && col==1 || row==5 && col==1 || row==5 && col==2) {
    				System.out.print("*  ");
    			}else
    				System.out.print("   ");
    		}System.out.println();
    	}
    }
    public void patternK() {
    	for(int row=1;row<=7;row++) {
    		for(int col=1;col<=8;col++) {
    			if(col==1 ||col+row==6 && col<=5 ||  row-col==2) {
    				System.out.print("* ");
    			}else
    				System.out.print("  ");
    		}
    	System.out.println();
    		}
    	
    }
    public void patternL() {
    	for(int row=1;row<=5;row++) {
    		for(int col=1;col<=5;col++) {
    			if(col==1 || row==5) {
    			System.out.print("* ");
    		}else
    			System.out.print(" ");
    	}System.out.println();
    	}
    }
    public void patternM() {
    	for(int row=1;row<=7;row++) {
    		for(int col=1;col<=7;col++) {
    			if(col==1 || col==7 ||col==row && col<=4 || col+row==8 && col>=4) {
    				System.out.print("* ");
    			}
    			else
    			System.out.print("  ");
    	}System.out.println();
    	}
    		
    }
    public void patternN() {
    	for(int row=1;row<=4;row++) {
    		for(int col=1;col<=4;col++) {
    			if(col==1 || col==4) {
    				System.out.print("* ");
    				
    			}else if(row<=3)
    			if(col==row || col==row-5) {
    				System.out.print("* ");
    			}else
    				System.out.print("  ");
    			else
    				System.out.print("  ");
    			
    		}
    		System.out.println();
    	}
    }
    public void patternO() {
    	for(int row=1;row<=5;row++) {
    		for(int col=1;col<=5;col++) {
    			if(row==1 || row==5 || col==1 || col==5) {
    				if(row==1 && col==1 || row==1 && col==5 || row==5 && col==1 || row==5 && col==5) {
    					System.out.print("  ");
    				}else
    					System.out.print("* ");
    		}else
    			System.out.print("  ");
    	}System.out.println();
    		}
    }
    	public void patternP() {
    		for(int row=1;row<=7;row++) {
        		for(int col=1;col<=4;col++) {
        			if(col==1 || row==4 || row==1) {
        				System.out.print("* ");
        			}else if(row<=4)
        				if(col==4) {
        					if(row==1 && col==4 || row==4 && col==4 ) {
        					System.out.print("  ");
        					}else
        						System.out.print("* ");
        					}
        				
        				else
        					System.out.print("   ");
        			
        		}
        		System.out.println();
    		}
    }
    	public void patternQ() {
    		for(int row=1;row<=6;row++) {
        		for(int col=1;col<=6;col++) {
        			if(row<=5 && col<=5) {
        			if(row==1 || row==5 || col==1 || col==5) {
        				if(row==1 && col==1 || row==1 && col==5 || row==5 && col==1) {
        					System.out.print("  ");
        				}else
        					System.out.print("* ");
        				}else if(row==4 && col==4) {
        						System.out.print("* ");
        					}else
                				System.out.print("  ");
        			
        		}else if(col==row) {
        			System.out.print("*  ");
        		}else
        		System.out.print("  ");
        			}
        			System.out.println();
    		 }
        		
    		}
    	
    		
    	public void patternR() {
    		for(int row=1;row<=7;row++) {
        		for(int col=1;col<=4;col++) {
        			if(col==1 || row==1 || row==4 || col==4) {
        				if(row==1 && col==4 || row==4 && col==4) {
        					System.out.print("  ");
        				}else
        					System.out.print("* ");
        		}else
        			System.out.print("  ");
    		}System.out.println();
        		}
    		
    	}
    	public void patternS() {
    		for(int row=1;row<=5;row++) {
        		for(int col=1;col<=5;col++) {
        			if(row==1 || row==3 || row==5 || row==2 && col==1 || row==4 && col==5) {
        				if(row==1 && col==1 || row==3 && col==5 || row==5 && col==5) {
        				System.out.print(" ");
        			}else
        			System.out.print("* ");
        		}else
        				System.out.print("  ");
    		}System.out.println();
        		}
    		
    		
    	}
    	public void patternT() {
    		for(int row=1;row<=5;row++) {
        		for(int col=1;col<=5;col++) {
        			if(row==1 || col==3) {
        				System.out.print("* ");
        		}else
        			System.out.print("  ");
    		}System.out.println();
        		}
    		
    	}
    	public void patternU() {
    		for(int row=1;row<=5;row++) {
        		for(int col=1;col<=4;col++) {
        			if(col==1 || col==4 || row==5) {
        				if(row==5 && col==1 || row==5 && col==4) {
        					System.out.print("  ");
        				}else
        					System.out.print("* ");
        			
        		}else
        			System.out.print("  ");
    		}System.out.println();
        		}
    		
    	}
    	public void patternV() {
    		for(int row=1;row<=7;row++) {
        		for(int col=1;col<=7;col++) {
        				if(col==row && col<=4|| col+row==8 && col>=4) {
 
        					System.out.print("* ");
        				}else
        					System.out.print("  ");
        			
        			
        		}
        		System.out.println();
    		}
        		
    	}
    	public void patternW() {
    		for(int row=1;row<=7;row++) {
    			for(int col=1;col<=7;col++) {
    		    if(col==1 || col==7 || col==row && col>=4|| row+col==8 && col<=4) {
    		    	System.out.print("* ");
    		    }
    		   
    		    else
    		    	System.out.print("  ");
    			}System.out.println();		
    		
    	}

   	}
    	public void patternX() {
    		for(int row=1;row<=7;row++) {
    			for(int col=1;col<=7;col++) {
    				if(col==row || col+row==8) {
    					System.out.print("* ");
    				}else
    					System.out.print("  ");
    			}
    			System.out.println();
    		}
    	}
    	public void patternY() {
    		for(int row=1;row<=7;row++) {
    			for(int col=1;col<=7;col++) {
    					if(row==col && col<=4|| col+row==8) {
    						System.out.print("* ");
    					}
    				else
    					System.out.print("  ");
    			}System.out.println();
    		}
    		
    	}
    	public void patternZ() {
    		for(int row=1;row<=6;row++) {
    			for(int col=1;col<=5;col++) {
    				if(row==1 || row==5 || col==6-row) {
    					System.out.print("* ");
    			}else {
    				System.out.print("  ");
    			}
    		}System.out.println();
    			}
    	}
    	
    		
  	}
    		
