
package array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		ArrayDemo obj=new ArrayDemo();
		//obj.learning();
		//obj.learning2();
		//obj.learning3();
		//obj.learning4();//find highest and second highest
		//obj.learning5();
		//obj.learning6();
		//obj.learning7(); //print repeated character
		//obj.learning8(); //print 1st repeated character
		//obj.learning9(); // print only 1st repeated character
		//obj.learning10();//program for no repeated character
		//obj.learning11(); //print non repeated character
		//obj.learning12();//print 1st non repeated character   
        obj.learning13();// count of each char
		//obj.learning14();//most frequent repeated char

	}
	private void learning14() {
		char[] name= {'s','n','e','k','a','s','e','n','n'}; 
		int big=0;
		char c=' ';
		for(int j=0;j<name.length;j++) {
			int count=1;
			char ch=name[j];
			if(ch=='*') 
				continue;
			for(int i=j+1;i<name.length;i++) {
				if(ch==name[i]) {
					name[i]='*';
					count++;		
				}
			}
			if(count>big) {
				big=count;
				c=ch;
			}
			}
		
		System.out.println("fequent letter " + c +" is "+big);
	}
	private void learning13() {
		char[] name= {'s','n','e','k','a','s','e'};
		for(int j=0;j<name.length;j++) {
			int count=1;
			char ch=name[j];
			if(ch=='*') 
				continue;
			for(int i=j+1;i<name.length;i++) {
				if(ch==name[i]) {
					name[i]='*';
					count++;		
				}
			}
			System.out.println("count of"+ch+"is"+count);
			}
	}
	private void learning12() {
		char[] name= {'s','n','e','k','a','s','e'};
		for(int j=0;j<name.length;j++) {
			boolean repeated=false;
			char ch=name[j];
			if(ch=='*') 
				continue;
			for(int i=j+1;i<name.length;i++) {
				if(ch==name[i]) {
					name[i]='*';
					repeated=true;
					break;
				}
			}if(repeated==false) {
				System.out.println("non repeated char"+ch);
				break;
			
			}
			
			}
		
	}
	private void learning11() {
		char[] name= {'s','n','e','k','a','s','e'};
		for(int j=0;j<name.length;j++) {
			boolean repeated=false;
			char ch=name[j];
			if(ch=='*') 
				continue;
			for(int i=j+1;i<name.length;i++) {
				if(ch==name[i]) {
					name[i]='*';
					repeated=true;
					break;
				}
			}if(repeated==false) {
				System.out.println("non repeated char"+ch);
			
			}
			
			}
		}
		
	
	private void learning10() {
		
		char[] name= {'s','n','e','k','a','e','n'};
		boolean repeat=true;
		for(int j=0;j<name.length-1;j++) {
		char ch=name[j];
		
		for(int i=j+1;i<name.length;i++) {
			if(ch==name[i] ){
			System.out.println("The repeated character is:"+ch);
			repeat=false;
			break;
			}
			if(repeat==false) {
				break;
			}
		}
			
		}if(repeat==true) 
			System.out.println("no repeated character");
		
	}
	private void learning9() {
		int count=0;
		char[] name= {'s','n','e','k','a','e','n'};
		for(int j=0;j<name.length-1;j++) {
		char ch=name[j];
		for(int i=j+1;i<name.length;i++) 
			if(ch==name[i] ){
			System.out.println("The repeated character is:"+ch);
			count++;
			break;
			}if(count==1) {
				break;
			}
		}
		
	}
	private void learning8() {
		char[] name= {'s','n','e','k','a','e','n'};
		char ch=name[0];
		for(int i=1;i<name.length;i++) 
			if(ch==name[i] ){
			System.out.println("The repeated character is:"+ch);
			break;
			}
		
	}
	private void learning7() {
		char[] name= {'s','i','n','e','k','a','e','n'};
		for(int j=0;j<name.length-1;j++) {
		char ch=name[j];
		for(int i=j+1;i<name.length;i++) 
			if(ch==name[i] ){
			System.out.println("The repeated character is:"+ch);
			break;
			}
	
		}
	
		
	}
	private void learning6() {
		int[] ar= {5,-10,-20,30,-40,50};
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<0) {
				System.out.println("the negative number:"+ar[i]);
				count++;
			}
			if(ar[i]<0 && ar[i]%20==0) {
				System.out.println("the negative number%20:"+ar[i]);
			}
			if(ar[i]<0 && ar[i]%2==0) {
				System.out.println("even index position"+ar[i]);   
			}
		}System.out.println("count of negative number:"+count);
	}
	private void learning5() {
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
		int[] marks= {100,95,96,89,99};
	  int lowest=Integer.MAX_VALUE;
	  int second_lowest=Integer.MIN_VALUE;
		for(int i=1;i<marks.length;i++) {
			if(marks[i]<lowest) {
				second_lowest=lowest;
			lowest=marks[i];		
			}else if(marks[i]<second_lowest) {
				second_lowest=marks[i];				
			}
		}
		System.out.println(lowest);
		System.out.println(second_lowest);
		
	}
	private void learning4() {
		
		int[] marks= {92,95,96,89,99};
	  int highest=marks[0],second_highest=marks[0];
		for(int i=1;i<marks.length;i++) {
			if(marks[i]>highest) {
				second_highest=highest;
			highest=marks[i];		
			}else if(marks[i]>second_highest) {
				second_highest=marks[i];				
			}
		}
		System.out.println(highest);
		System.out.println(second_highest);
		
	}
	private void learning3() {
		int[] marks= {96,100,96,100,98};
		int count=0;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]==100) {
			System.out.println("Mark = 100:"+marks[i]);
			count++;
			}
			if(marks[i]>96) {
				System.out.println("marks greater than 96:"+marks[i]);
			}
		}System.out.println("count of 100:"+count);
		
	}
	private void learning2() {
		  
		   //Using Scanner class for highest and lowest mark
		  //int[] marks= {90,89,96,95,98};
		  int [] marks = new int[5];
		  Scanner sc =new Scanner(System.in);
		  int high=0;
		  int low=100;
		  for(int i=0;i<marks.length;i++){
		   System.out.println("Enter Mark");
		     marks[i]=sc.nextInt();
		   
		   if(marks[i]>high) {
		    high=marks[i];
		   }
		   if(marks[i]<low) {
		    low=marks[i];
		   }
		   
		  }System.out.println(high);
		  System.out.println(low);
		  
		 }

		 private void learning() {
		  //1.
		  
		  int [] marks = new int[5];
		  /*marks[0]=89;
		  marks[1]=91;
		  marks[2]=93;
		  marks[3]=100;
		  marks[4]=98;*/
		  
		//  System.out.println(marks[0]);
		//  System.out.println(marks[1]);
		//  System.out.println(marks[2]);
		//  System.out.println(marks[3]);
		//  System.out.println(marks[4]);
		  
		  //[or]
		  //2.   Scanner class concept for total and average
		  Scanner sc =new Scanner(System.in);
		  //System.out.println("Enter Mark:  ");
		  int total=0;
		  for(int i=0;i<marks.length;i++)
		  {
		   
		  System.out.println("Enter mark: ");
		  marks[i] =  sc.nextInt();
		  System.out.println(marks[i]);
		  total=total+marks[i];
		  }
		  sc.close();   //it means memory closed
		  System.out.println(total);
		  System.out.println(total/marks.length);
		 }

		


}
