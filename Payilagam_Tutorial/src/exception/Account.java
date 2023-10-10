package exception;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		Account acc=new Account();
		acc.account();
	}

	private void account() {
		int acc_blc=1000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount:");
		int withdraw=sc.nextInt();
		try {
		if(withdraw >1000) {
			throw new insufficientException(withdraw-acc_blc);
		}else {
			System.out.println("Withdraw successfully");
		}
		}catch(insufficientException ae) {
			System.out.println("insufficient amount");
		}
	}

}

