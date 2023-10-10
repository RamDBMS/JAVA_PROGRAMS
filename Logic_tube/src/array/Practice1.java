package array;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Practice1 ar=new Practice1();
		//ar.method1();//remove duplicate
		ar.method2();//highest
		//ar.method3();//equality of two array compare with length
		//ar.method4();// two sum
		int[] a= new int[5];
		Scanner sc=new Scanner(System.in);
		for(int k=0;k<a.length;k++) {
		System.out.println("enter the array:");
		a[k]=sc.nextInt();
		}
		System.out.println("enter target:");
		int target=sc.nextInt();
		int[] result=ar.method5(a,target); //two sum (user input)
		System.out.println(result);
	}

	private int[] method5(int[] a, int target) {
		for(int k=0;k<a.length;k++) {
			for(int j=k+1;j<a.length;j++) {
				if(a[k]+a[j]==target);
				return new int[] {k,j};
			}
			
		}return a;
		
	}

	private void method4() {
		int[] ar= {	2,5,6,7,8};
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]+ar[j]==11) {
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}
	private void method3() {
		int[] ar= {2,3,5,7};
		int[] ar1= {2,3,6,7};
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==ar1[i] ) {
				count++;	
			}
			
		}if(count==ar.length) {
			System.out.println("equal");
			
		}else {
			System.out.println("not equal");
		}
		
		
	}

	private void method2() {
		int[] ar= {99,89,90,91,100,80,92};
		int second_highest=ar[0];
		int highest=ar[0];
		int third_highest=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>highest) {
				second_highest=highest;
				highest=ar[i];
			}else if(ar[i]>second_highest){
				second_highest=ar[i];
				
			}else if(ar[i]>third_highest) {
				third_highest=ar[i];
			}
		}System.out.println(highest);
		
		
	}

	private void method1() {
		int[] ar= {2,3,3,4,5,5,5,6,7,7};
		int unique=1;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]==ar[i+1]){
				ar[unique]=ar[i+1];
				unique++;
					}
		}for(int k=0;k<unique;k++) {
			System.out.println(ar[k]);
			
		}
		
	}
}

