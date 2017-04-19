package com.random;

public class StringUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="kiranmai";
		char[] ch=s.toCharArray();
		char[] rev=new char[ch.length];
		for(int i=0;i<ch.length;i++){
			rev[i]=ch[ch.length-(i+1)];
			
		}
       System.out.println(rev);
	}

}
