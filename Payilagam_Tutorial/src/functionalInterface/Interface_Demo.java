
package functionalInterface;

public class Interface_Demo implements FunctionalDemo {

	public static void main(String[] args) {
		Interface_Demo id=new Interface_Demo();
		id.test(2,5);
		id.test2();
		FunctionalDemo.test3();

	}

	@Override
	public int test(int no1,int no2) {
         return 2+5;
}
}
