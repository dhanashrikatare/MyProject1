package com.string.questions;

public class StringPractice {
	
	/**reverse string*/
	
	public static void main(String[] args) {
		
		
		String s="dhanu";
		
		String rev="";
		
		
		for(int i=s.length()-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		
	}
	
	

}
