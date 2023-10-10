package operators;

public class Arithmetric {
	public static void main(String[] args) {
		int no=2;
		int no1=2;
		System.out.println("Adition:"+(no+no1));
		System.out.println("Subraction:"+(no-no1));
		System.out.println("Multiplication:"+(no*no1));
		System.out.println("Division:"+no/no1);
		System.out.println("Modulus:"+no%no1);
		
		System.out.println(no==no1);
		System.out.println(no!=no1);
		
		int no2=2;
		no2++; //no2=no2+1
		System.out.println(no2);
		
		int no3=5;
		//post increment
		no3++;
		System.out.println(no3);//6
		System.out.println(no3++);//6
		System.out.println(no3);//7	
		//post decrement
		System.out.println(no3--);//7
		System.out.println(no3); //6
		//pre increment
		int no4=6;
		System.out.println(no4); //6
		System.out.println(++no4);//7
		System.out.println(no4);//7
		//pre decrement
		int no5=4;
		System.out.println(no5);//4
		System.out.println(--no5);//3
		System.out.println(no5);//3 
		
		int i=6;
		int j=12;
		System.out.println(i++);//6
		System.out.println(--j);//11
		int m=((i++/--j));
		System.out.println(m);//0
		System.out.println(i);//8
		System.out.println(j--);//10
		int n=(i+j--);
		System.out.println(n);//17
		System.out.println(--i);//7
		System.out.println(j++);//8
		int s=(--i*j++);
		System.out.println(s);
		System.out.println(m+n-s);
		
		
		
	    //int f=12,g=5,h=2;
	    //int m=(f/2-10%(4+3)-2*f%g-h*3);
	    //System.out.println(m);
	    
	    
	    
		
		}

}

