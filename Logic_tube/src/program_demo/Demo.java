package program_demo;

import java.util.StringTokenizer;

public class Demo {

	public static void main(String[] args) {
	/*	String str="sneka";
		String str1="Ram";
		int len=str.length();
		int len1=str1.length();
		int count=1;
		char s1[]=str.toCharArray();
		char s2[]=str1.toCharArray();
		
		if(len==len1) {
			for(int i=0;i<len;i++) {
				if(s1[i]!=s2[i]) {
					count=0;
					break;
					
				}
			}
		}else {
					count=0;
				}
			
		if(count==1) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}*/
		//***********************************************************************************
		/*String s1="saneka";
		char str[]=s1.toCharArray();
		for(int i=s1.length()-2;i>=0;i--) {
			if(str[i]=='a') {
			System.out.println("The first occurence of string is:"+str[i]+"position is:"+i);
			}
		}*/
		//*************************************************************************************
	/*	String str="sneka";
		char remove='k';
		String s="";
		char s1[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(s1[i]!=remove) {
				 s+=s1[i];
			}
		}
		System.out.println(s);*/
		//************************************************************************************
	   /*	String str="create youtube link";
		char s1[]=str.toCharArray();
		
		String str1="aeiou";
		char s2[]=str1.toCharArray();
		for(int i=0;i<str1.length();i++) {
			int count=0;
			for(int j=0;j<str.length();j++) {
				if(s1[j]==s2[i]) {
					count++;	
				}
			}
			System.out.println(s2[i]+"The count is:"+count);
		}*/
		//**********************************************************************************
		/*String str="amma";
		char s1[]=str.toCharArray();
		String s=""; 
		String str1="amma";
		for(int i=str.length()-1;i>=0;i--) {
			s+=s1[i];
			
		}if(str1==str) {
			System.out.println("The given string is palindrome");
		}else {
			System.out.println("not palindrome");
		}*/
		//***********************************************************************************
	/*	String str="Today is good day";
		char s1[]=str.toCharArray();
		String str1="good";
		char s2[]=str1.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(s2[0]==s1[i]) {
				int count=0;
			
			for(int j=0;j<str1.length();j++) {
				if(s2[j]==s1[i]) {
					count++;
					i++;
				}
			}
		if(count==str1.length()) {
			System.out.println("contains");
			break;
		}else {
			System.out.println("not contain");
		}
			}	
		}*/
		//***********************************************************************************
		/*String str="Today is good day";
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}*/
		//***********************************************************************************
	   /*	String str="Today is good day";
		char s[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(s[i]!=' ') {
				System.out.print(s[i]);
			}else {
				System.out.println();
			}
			
		}*/
		//**************************************************************************************
		/*String str="today is good day";
		char s[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			System.out.println((char)(s[i]-32));
		}*/
		//************************************************************************************
		/*String str="Today is";
		String str1="good day";
		for(int i=0;i<=str.length()-1;i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println(" "+str1);*/
		//*************************************************************************************
		
		
		}
		
	}


