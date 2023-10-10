package functionalInterface;

public class Lamda_Demo {
public static void main(String[] args) {
	FunctionalDemo id =(int no1,int no2)-> no1+no2;
	int rs=id.test(10,15);
	System.out.println(rs);
}
}

