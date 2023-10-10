package functionalInterface;

@FunctionalInterface
public interface FunctionalDemo {
	public abstract int test(int no1,int no2);
	
	
	static void test3() {
		System.out.println("test3");
		
	}
	
	default void test2() {
		System.out.println("test2");
	}

}

