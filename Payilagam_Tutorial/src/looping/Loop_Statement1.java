
package looping;

public class Loop_Statement1 {
	
public static void main(String[] args) {
	Loop_Statement1 obj=new Loop_Statement1();
	//obj.div20();
	//obj.div20first2();
	//obj.cd();
    //obj.GCD();
	//obj.mul3();
	//obj.least();
	//obj.square();
	// obj.displaylast();
	//obj.display();
	obj.count_of_digit();
	//obj.total_digits_add(94659068);
	//obj.reverse();
	//obj.prime_number();
	//obj.GD();
	//obj.Count_of_divisor();
	//obj.lasttwo_number();
	//obj.First_last();
	//obj.print();
	//obj.fibonacci();
	//obj.palindrome();
	//obj.factorial();
	//obj.armstrong();
}
	/*int no=1;
	while(no<=10) {
		System.out.println(no);
		no++;
	}*/
	/*int i=1;
	int j=11;
	int k;
	while(i<=9) {
		k=i*j;
		System.out.println(k);
		i++;
	}*/
    public void div20() {
	int no1=20;
	int div=1;
	while(div<=no1) {
		if(no1%div==0) {
			System.out.println(div);
			
		}div++;
	}
}
	public void div20first2() {
	int no2=10;
	int div1=1;
	int count=0;
	while(div1<=no2) {
		if(no2%div1==0) {
			if(count==2) {
				System.out.println(div1);
			}
			count++;
		}div1++;
	}
}
    public void cd() {
	int no3=10; //common divisor
	int no4=15;
	int small=no3<no4?no3:no4;
	int div2=1;
	while(div2<=small) {
		if(no3%div2==0 && no4%div2==0) {
			System.out.println(div2);
		}div2++;
	}
    }
public void GCD() {
	int no=15; //greatest common divisor
	int no1=20;
	int small=no<no1?no:no1; //ternary operator
	int div2=1;
	int last=0;
	while(div2<=small) {
		if(no%div2==0 && no1%div2==0) {
			last=div2;
			
		}div2++;
	}System.out.println(last);
}
    public void mul3() {
	int no=3; // multiple by 3
	int count=1;
	while(count<=10) {
		System.out.println(count*no);
		count++;
	}
    }
	public void least() {
	int no1=20; // least common multiple
	int no2=25;
	int big=no1<no2?no1:no2;
	while(true) {
		if(big%no1==0 && big%no2==0) {
			System.out.println(big);
			break;
		}big++;
	}
}
	public void square() {
		int no=1;
		int i=0;
		while(no<=10) {
			i=no*no;
			System.out.println(i);		
			
		no++;
		}
	
}
	public void displaylast() {
	int i=5678;
	while(i>0) {
		System.out.print(i%10);
		//i=i/10;
		break;
	}
	
	}
	public void display() {
		int i=5678;
		int count=0;
		while(i>0) {
			i=i/10;
			if(count<1)	{
			System.out.println(i%10);
			}count++;
			}
	
		}
	public void lasttwo_number() {
		int i=5678;
		//int count=0;
		int rem=0;
		while(i>0) {
			rem=i%100;
		//if(count==1) {
			System.out.print(rem);
			break;
		//}count++;
		//i=i/10;
		}
   	 
    }
	public void First_last() {
		int no=1235369;
		int last=no%10;
		int first=0;
		System.out.println("last no is:"+last);
		while(no>0) {
			first=no%10;
			no=no/10;
		}System.out.println("First no is:"+first);
		
	}
	public void count_of_digit() {
		int no=57869;
		int count=0;
		while(no>0) {
			no=no/10;
			count++;
		}System.out.println(count);
		
	}
	public void total_digits_add(int no) {
		//int no=94659068;
		int total=0;
		while(no>0) {
			total=total+no%10;
			no=no/10;
			
		}
		if(total>9) {
			System.out.println(total);
			total_digits_add(total);
		}
		else
			System.out.println(total);
		//int n1=total/10%10;
		//int n2=total%10;
		//System.out.println(n1+n2);
	}
	public void reverse() {
		int no=1234;
		while(no>0) {
			System.out.print(no%10);
			no=no/10;
		}
	}
	public void prime_number() {
		int no=2;
		while(no<=100) {
		int count=0;
		int div=2;
				while(div<no) {
				if(no%div==0)	
 {
				count++;
			}div++;
		}if(count==0) {
			System.out.println(no+ "prime number");
		}
		else 
		{
			System.out.println(no+ "not a prime number");
		}
		no++;
		}
	}
	
	public void GD() {
		int no=50;
	    int div=2;
	    int last=1;
	    while(div<=no) {
	    	if(no%div==0) {
	    		last=div;
	    	}
	    		div++;
	    	}System.out.println(last);
	    }
	public void Count_of_divisor() {
		int no=20;
		int div=2;
		int count=0;
		while(div<no) {
			if(no%div==0) {
				System.out.println(div);
				count++;
			}div++;
		}
		System.out.println("count of divisor:"+count);
	}
	public void print() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
	public void fibonacci() {
		int no1=0;
		int no2=1;
		int no3=0;
		System.out.print(no1+" ");
		int count=10;
		while(no3<=count) {
			no3=no1+no2;
			System.out.print(no3+" ");
			no1=no2;
			no2=no3;
			
		}
	}
	public void palindrome() {
		int no=121;
		int no1=no;
		int rev=0;
		int rem=0;
		while(no1>0) {
			rem=no1%10;
			rev=rev*10+rem;
			no1=no1/10;			
		}
		System.out.println(rev);
		if(no==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}
	
	public void factorial() {
		int fact=1;
		int number=5;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
			System.out.println("The factorial of 5 is:"+fact);
		
	}
	public void armstrong() {
		int num=1634;
		int num1=num;
		int rem=0;
		int result=0;
		while(num1>0) {
			rem=num1%10;
			result+=Math.pow(rem,4);
			num1=num1/10;
			
		}if(num==result) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not a armstrong number");
		}
		
	}
     
}
	
