package exception;

import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		ExceptionDemo3 obj=new ExceptionDemo3();
		obj.account();

	}

	private void account() {
		int acc_blc=1000;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		int withdraw=sc.nextInt();sc.close();
		try {
			if(withdraw>acc_blc) {
				throw new insufficientException(withdraw-acc_blc);
			}else {
				System.out.println("withdraw succesfully");
				System.out.println(acc_blc);
			}
		}catch(insufficientException ae) {
				System.out.println("insufficient balance");
			}
		}
	
		
		
}
