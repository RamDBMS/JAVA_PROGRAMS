
package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Array1 ar=new Array1();
		//ar.method1();
		//ar.method2();
		ar.method3();
		//ar.method4();

	}

	private void method4() {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the n value: ");
	      int n = sc.nextInt();
	      int inpuArray[] = new int[n];
	      System.out.println("Enter (n-1) numbers: ");
	      for(int i=1; i<n; i++) {
	         inpuArray[i] = sc.nextInt();
	      }
	      //Finding the missing number
	      int sumOfAll = (n*(n+1))/2;
	      int sumOfArray = 0;
	      for(int i=1; i<n; i++) {
	         sumOfArray = sumOfArray+inpuArray[i];
	      }
	      int missingNumber = sumOfAll-sumOfArray;
	      System.out.println("Missing number is: "+missingNumber);
	   }
	
	private void method3() {
			   
		      //Declare and initialize the array elements
		      int array[] = {16, 17, 4, 3, 5, 6, 9, 1, 8, 2};
		      int size = array.length;
		      System.out.println("Leaders in the array are: ");

		      //Logic Implementtaion
		      for (int i = 0; i < size; i++){
		         int j;
		         for (j = i + 1; j < size; j++){
		            if (array[i] <=array[j])
		               break;
		         }
		         if (j == size) // the loop didn't break{
		         
		            //print the result
		            System.out.print(array[i] + " ");
		         }
		      }
		


	private void method2() {
		
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter the size of the array that is to be created: ");
		      int size = sc.nextInt();
		      int[] myArray = new int[size];
		      System.out.println("Enter the elements of the array: ");
		      for(int i=0; i<size; i++){
		         myArray[i] = sc.nextInt();
		      }
		      System.out.println("The array created is: "+Arrays.toString(myArray));
		      System.out.println("Resultant array: ");
		      int pos = 0;
		      for(int i=0; i<myArray.length; i++){
		         if(myArray[i]!=0){
		            myArray[pos]=myArray[i];
		            pos++;
		         }
		      }
		      while(pos<myArray.length) {
		         myArray[pos] = 0;
		         pos++;
		      }
		      System.out.println("The array created is: "+Arrays.toString(myArray));
		   }
		

	private void method1() {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created: ");
	      int size = sc.nextInt();
	      int[] myArray = new int[size];
	      System.out.println("Enter the elements of the array: ");
	      for(int i=0; i<size; i++){
	         myArray[i] = sc.nextInt();
	      }
	      //Reading the number
	      System.out.println("Enter the number: ");
	      int num = sc.nextInt();
	      System.out.println("The array created is: "+Arrays.toString(myArray));
	      System.out.println("indices of the elements whose sum is: "+num);
	      for(int i=0; i<myArray.length; i++){
	         for (int j=i; j<myArray.length; j++){
	            if((myArray[i]+myArray[j])== num && i!=j){
	               System.out.println(i+", "+j);
	            }
	         }
	      }
		
	}

}
