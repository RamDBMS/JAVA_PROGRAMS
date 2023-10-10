
package array;

public class Array2 {

	public static void main(String[] args) {
		Array2 obj=new Array2();
		obj.method1();

	}

	private void method1() {
		int[] ar= {8,2,5,6,4,1};
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
				}
			}System.out.println(ar[i]);
		}
		
	}

}
