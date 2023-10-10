package learn_string;

public class StringDemo {

	public static void main(String[] args) {
		StringDemo sd=new StringDemo(); //it stored in heap memory(with new keyword)
		//String s="abc"; //it stored in string constant pool(without new keyword)
	   // s="acyu"; // it stored in heap memory(with new keyword)
		
		//System.out.println(s);
		//System.out.println(s);
		
		String s="maveeran";
	    s="Dada";
		String s2="good night";
		String s3="maveeran";
		
		System.out.println(s);
		//System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(System.identityHashCode(s));
		//System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		System.out.println();
		
		String name="sneka";
		System.out.println(name.length());
		for(int i=0;i<name.length();i++) {
			System.out.print(name.charAt(i)+" ");
		}
		System.out.println();
        String name1="Balakumar";
        for(int i=0;i<name1.length();i++) {
        	if(name1.charAt(i)=='a') {
        		System.out.print(name1.charAt(i)+" ");
        	}
        }
        System.out.println();
        String name2="poongodi";
        int count=0;
        for(int i=0;i<name2.length();i++) {
        	count++;
        }
        System.out.println(count);
        System.out.println();
        
        String name3="sneka ";
        String name4="Sneka ";
        System.out.println(name3.compareTo(name4));
        System.out.println(name3.compareToIgnoreCase(name4));
        System.out.println(name3.concat("sri"));
        System.out.println(name3.contains("eka"));
        System.out.println(name3.endsWith("ka "));
        System.out.println(name3.equals(name4));
        System.out.println(name3.equalsIgnoreCase(name4));
        System.out.println(name3.hashCode());
        System.out.println(name3.indexOf('a'));
        System.out.println(name3.indexOf("ne"));
        System.out.println(name3.lastIndexOf('k'));
        
        System.out.println(name3.replace('s', 'j'));
        System.out.println(name3.startsWith("s"));
        System.out.println(name3.substring(2,4));
        
         System.out.println();
        char[] ch=name3.toCharArray();
        for(int i=0;i<ch.length;i++) {
        	System.out.println(ch[i]);
        }System.out.println(ch.length);
        
        System.out.println(name4.toLowerCase());
        System.out.println(name1.toUpperCase());
        System.out.println(name3.trim());
        
        System.out.println();
         String date="31-07-2023";
         String[] ar=date.split("-");
         for(int i=0;i<ar.length;i++) {
        	 System.out.println(ar[i]);
         }
         System.out.println();
         String name5="balu";
         String[] sc=name5.split("-");
         for(int i=0;i<sc.length;i++) {
        	 System.out.println(sc[i]);
         }
        
	}
	
	
	
}

