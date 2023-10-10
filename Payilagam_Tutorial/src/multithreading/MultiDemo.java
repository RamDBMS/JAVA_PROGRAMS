package multithreading;

public class MultiDemo {
	
	public static void main(String[] args) {
		MultiDemo obj=new MultiDemo();
		obj.method1();
	}

	private void method1() {
		if(true!=false) {
			System.out.println("ice");
		}
		else {
			System.out.println("cream");
		}
	}
	
}

