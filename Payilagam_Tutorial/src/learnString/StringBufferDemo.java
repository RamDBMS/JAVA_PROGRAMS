package learn_string;

public class StringBufferDemo {

	public static void main(String[] args) {
		String name="sneka"; // string is immutable
		name=name.concat("sb");
		System.out.println(name);
		
		StringBuffer sb=new StringBuffer("sneka");//string buffer is mutable
        System.out.println(sb);
        sb.append("sri");
        System.out.println(sb);
       // sb.reverse();
       // System.out.println(sb);
        sb.insert(5,"_");
        System.out.println(sb);
	}

}

