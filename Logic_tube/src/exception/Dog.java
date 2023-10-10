
package exception;

public class Dog {
	String dogName="vicky";
	//int a=5;

	public static void main(String[] args) {
		Dog dog=null;
		try {
		System.out.println(dog.dogName);
		}catch(NullPointerException ae){
			Dog dog1=new Dog();
			System.out.println(dog1.dogName);
			
		}
		

	}

}
