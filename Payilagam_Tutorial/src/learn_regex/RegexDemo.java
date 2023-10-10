package learn_regex;

import java.util.StringTokenizer;
import java.util.regex.*;

public class RegexDemo {

	public static void main(String[] args) {
		//String input = "My mobile number is 9884010000 *";
	    //Pattern patternObj = Pattern.compile("\\d{10}");
		//Pattern patternObj = Pattern.compile("[0123456789]");
		//Pattern patternObj = Pattern.compile("[0-9]");
		//Pattern patternObj = Pattern.compile("[a-z]");
		//Pattern patternObj = Pattern.compile("[a-zA-Z]");
		//Pattern patternObj = Pattern.compile("[a-zA-Z0-9]");
		//Pattern patternObj = Pattern.compile("[^a-zA-Z0-9]");



	    //Matcher matcherObj = patternObj.matcher(input);
	   // while(matcherObj.find())
	    //{
	     // System.out.print(matcherObj.group());
	     // System.out.println(matcherObj.start());
	      //System.out.println(matcherObj.end());

	  //  }
		
		
		
	
	   // String password = "Chennai is the capital of TamilNadu";
	   // Pattern patternObj = Pattern.compile("TamilNadu$"); //$ --last word
	    //Pattern patternObj = Pattern.compile("^Chennai"); // ^ --first word
	    //Pattern patternObj = Pattern.compile("Chennai");
	    //  Matcher matcherObj = patternObj.matcher(password);
	    //  while(matcherObj.find())
	    //  {
	       // System.out.print(matcherObj.group());
	   //   }

		
		/*String password = "Chennai is the capital city";
		   Pattern patternObj = Pattern.compile("\\s");
		   //Pattern patternObj = Pattern.compile("\\d");
		   //Pattern patternObj = Pattern.compile("\\D");
		   Matcher matcherObj = patternObj.matcher(password);
		   int count = 0;
		   while(matcherObj.find())
		    {
		     count++;
		     System.out.print(matcherObj.group());
		    }
		    System.out.println(count);*/
		
		
		/*String mobile = "9884012810";
		  Pattern patternObj = Pattern.compile("[6-9][0-9]{9}");
		    Matcher matcherObj = patternObj.matcher(mobile);
		    while(matcherObj.find())
		    {
		      System.out.print(matcherObj.group());
		   }*/

		/*String mobile = "9884012810";
		Pattern patternObj = Pattern.compile("(0|91)?[0-9]{10}");// 0,+91 0r 0-9 {10}--count of number
		    Matcher matcherObj = patternObj.matcher(mobile);
		    while(matcherObj.find())
		    {
		      System.out.print(matcherObj.group());
		    }*/
		   
		  
		/* String pattern = "-";
	       String input = "28-March-2023";
	            Pattern patternObj = Pattern.compile(pattern);
	            String[] items = patternObj.split(input);
	            for(int i=0;i<items.length;i++)
	            {
	              System.out.println(items[i]);
	            }*/
   //  String sentence="21-10-1999";
   //  String sen2="http://www.sneka.com";
    // StringTokenizer st=new StringTokenizer(sentence,"-",true);
    // System.out.println("count the token:"+st.countTokens());
    /* while(st.hasMoreTokens()) {
    	 System.out.println(st.nextToken());
     }	*/	
	/*	String[] str= sen2.split("\\:|\\//|\\.");
		for(String s:str) {
			System.out.println(s);*/
		String sentence="ababaaabbbbababaabbb";
		Pattern p=Pattern.compile("a*");//compile method is used for regular expression.
		Matcher m=p.matcher(sentence);
		while(m.find()){
		System.out.println(m.group()+":"+m.start());
		}
		

	}

}
