package operators;

public class Work {
	public static void main(String[] args) {
		System.out.println("The result1 is:"+(3-2+2*2+3));
		System.out.println("The result2 is:"+(4/2+1-4*2+10));
		int a=4;
		int b=(3-2*--a);
		System.out.println("The result3 a is:"+a);
		System.out.println("The result4 b is:"+b);
		int c=4;
		int d=(3-2*c--);
		System.out.println("The result5 c is:"+c);
		System.out.println("The result6 d is:"+d);
		long e=2;
		long f=(4+3*e++);
		System.out.println("The result7 e is:"+e);
		System.out.println("The result8 f is:"+f);
		int g=10;
		int h=3;
		int i=g%h;
		int j=10%2;
		System.out.println("The result9 is:"+g);
		System.out.println("The result10 is:"+h);
		System.out.println("The result11 is:"+i);
		System.out.println("The result12 is:"+j);
		//Relational operator
		int k=10;
		int l=15;
		System.out.println(k<l);
		System.out.println(k>l);
		int m=20;
		int n=10;
		System.out.println(m>=n);
		System.out.println(m<=n);
		//logical operator
		int o=10;
		int p=15;
		System.out.println(o>p && o<p);//and operator
		System.out.println(o>p || o<p);//OR operator
		
		
		
		
		
		
	}

}
