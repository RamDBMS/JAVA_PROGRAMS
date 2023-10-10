package array;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Practice ar=new Practice();
		//ar.method1();//addition of two index
		//ar.method2();//Addition of two  array
		ar.method3();//concatenation of 2 array
		//ar.method4(); //print numbers between adjacent element
		//ar.method5();//eliminate 1st and last index of array
		//ar.method6();
		//ar.method7();//Bubble sort
		//ar.method8();//Removal of duplicates from ordered array
		//ar.method9(); //sub array
		//ar.method10(); //linear search
		//ar.method11(); //Binary search
		
	}
 
	private void method11() {
		int[] ar= {20,23,65,85,60};
		int key=23;
		int min=0;int max=ar.length-1;
		while(min<=max) {
			int mid=(min+max)/2;
			if(key==ar[mid]) {
				System.out.println("The key is present in"+mid+"position");
			break;
			}
			else if(key>ar[mid]) {
				min=mid+1;
			}else {
				max=mid-1;
			}
		}
		if(min>max) {
		System.out.println("Key is not present");
		}
		
	}

	private void method10() {
		int[] ar= {20,10,25,60,65};
		int key=60;
		for(int i=0;i<ar.length-1;i++) {
			if(key==ar[i]) {
				System.out.println(ar[i]+" ");
				break;
			}
		}
		
	}

	private void method9() {
		int[] a= {20,30,40,50,60,80};
		int[] b= {40,30,20};
		int count=0;
		for(int j=0;j<b.length;j++) {
			//int val=b[j];
			boolean present=false;
			for(int i=0;i<a.length;i++) {
				if(b[j]==a[i]) {
					//System.out.println(b[j]);
					count++;
					present=true;
					}
			}
				if(present==false) {
					System.out.println("Not sub Array");
				break;
			}
		}
			if(count==b.length) {
				System.out.println("Sub Array");
			}
		}

	private void method8() {
		int[] ar= {2,3,8,8,10,10,12};
			int unique=1;
			for(int i=0;i<ar.length-1;i++) {
				if(ar[i]!=ar[i+1]) 
				{
					ar[unique]=ar[i+1];
					//System.out.println(ar[i]+" ");
					unique++;				
					}	
			}
			for(int i=0;i<unique;i++) {
				System.out.println(ar[i]+" ");
			}
			
	}

	private void method7() {
		 int [] ar= {90,65,70,60,80};//65 90 70 60 80
		  for(int j=1;j<=ar.length;j++)//65 70 90 60 80
		  {                            //65 70 60 90 80
		  for(int i=0;i<ar.length-j;i++)//65 70 60 80 90
		  {
		   if(ar[i]>ar[i+1])
		   {
		    int temp=ar[i];
		    ar[i]=ar[i+1];
		    ar[i+1]=temp;
		    
		   }
		  }
		  System.out.println(ar[ar.length-j]);
		  
		 }
	}

	private void method6() {
		int[] ar= {5,10,8,12};
		for(int i=0;i<ar.length-1;i++) {
			int small=ar[i]<ar[i+1]?ar[i]:ar[i+1];
			int big=ar[i]>ar[i+1]?ar[i]:ar[i+1];
			int no1=small;
			int no2=big;
			for(int val=no1;val<=no2;val++) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		
		
	}

	private void method5() {
		int[] ar= {5,10,15,20};
		for(int i=0;i<ar.length-1;i++) {
			int no1=ar[i];
			int no2=ar[i+1];
			for(int val=no1+1;val<no2;val++) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		
		
	}

	private void method4() {
		int[] ar= {5,10,15,20};
		for(int i=0;i<ar.length-1;i++) {
			int no1=ar[i];
			int no2=ar[i+1];
			for(int val=no1;val<=no2;val++) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		
	}

	private void method3() {
		
		int[] a= {5,10,15};
		int []b= {20,25,30};
	    int j=0;
		int [] result=new int[a.length+b.length];
		for(int i=0;i<result.length;i++) {
			if(i<a.length) {
				result[i]=a[i];
				System.out.println(result[i]);	
			}else {
				result[i]=b[j];
				j++;
				System.out.println(result[i]);
			}
			//System.out.println(result[i]);
		}
	}

	private void method2() {
		int [] a= {5,10,15,20};
		int [] b= {15,10,5};
		int big=a.length>b.length?a.length:b.length;
		int[]  c=new int[big];
		int small=a.length<b.length?a.length:b.length;
		for(int i=0;i<big;i++) {
			if(i<small) {
				c[i]=a[i]+b[i];
				System.out.println(c[i]);
			}else {
				c[i]=a[i];
				System.out.println(c[i]);
			}
		}
		
	}

	private void method1() {
		int [] a= {5,10,15};
		int [] b= {15,11,5};
		int[]  c=new int[a.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
 		}
		
	}

	
	


}

