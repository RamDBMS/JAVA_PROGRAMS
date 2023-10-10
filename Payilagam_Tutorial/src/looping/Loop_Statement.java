package looping;

public class Loop_Statement {

	public static void main(String[] args) {
		/*System.out.print("Hi"+" ");
		System.out.print("Hi"+" ");
		System.out.print("Hi"+" ");
		System.out.print("Hi"+" ");
		System.out.print("Hi"+" ");//output:Hi Hi Hi Hi Hi
		
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi"); //output:Hi
		                               //  Hi
		                               //  Hi
		                               //  Hi
		                               //  Hi
		                                 
		                                   
		
		int count=0;
		while(count<=4) {
			System.out.print(count+" "); //output:0 1 2 3 4
			count=count+1;
		
		}
		System.out.println();
		
		int count1=1; //output: 1 2 3 4 5
		while(count1<6) {
			System.out.print(count1+" ");
			count1=count1+1;
			
		}
		System.out.println();
		
		int count2=0; //output:0 2 4 6 8
		while(count2<=8) {
			System.out.print(count2+" ");
			count2=count2+2;//count2+=2;//count2=count2*2;(for multiple)
		
		}
		System.out.println();
		
		int count3=5; //output: 5 4 3 2 1 0
		while (count3>=0) {
			System.out.print(count3+" ");
			count3-=1; //count3=count3-1;
		}
        System.out.println();
        int count4=9;      // output: 9 7 5 3 1 -1
        while(count4>=-1) {
        	System.out.print(count4+" ");
        	count4-=2;
        }
        */
        System.out.println();//divisible by 50(output: 2 5 10 25 50
        int no=50;
        int div=2;
        while(div<=no) {
        	if(no%div==0) {
        		System.out.print(div+ " " );
        		
        	}div++;
        }
        System.out.println();//first no divisible by 50(output:2)
       /* int no1=50;
        int div1=2;
        while(div1<=no1) {
        	if(no1%div1==0) {
        		System.out.print(div1+" ");
        		break;
        		
        	}div1++;
        }
        System.out.println(); 
        int no2=50; //divisible by 50 print last divisible (output:50)
        int div2=2;
        int last=0;
        while(div2<=no2) {
        	if(no2%div2==0) {
        		last=div2;
        	}div2++;
        	 	
        }System.out.println(last);
       
		  int no3=50; // first 2 divisible by 50(output:2 5) 
		  int div3=2; 
		  int con=0; 
		  while(div3<no3) { 
			  if(no3%div3==0) { 
				  if(con<2) {
		  System.out.print(div3+" "); 
		  
		  }
		  
		  }div3++; 
		  }
		 
        
		
		
		/*int count=0;
		if(count<=4) {
			System.out.print(count+" ");
			count=count+1;
		}
			if(count<=4) {
				System.out.print(count+" ");
				count=count+1;
			}
				if(count<=4) {
					System.out.print(count+" ");
					count=count+1;
				}
					if(count<=4) {
						System.out.print(count+" ");
						count=count+1;
					}
						if(count<=4) {
							System.out.print(count+" ");
							count=count+1;
			
			
		} */
						
						
		

	}

}

