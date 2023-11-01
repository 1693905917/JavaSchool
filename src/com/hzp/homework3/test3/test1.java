package com.hzp.homework3.test3;

public class test1 {
	public static void main(String[] args) {
		char s[]=new char[1024];
		String input = args[0];
		int i;
	    for(i=0;i<input.length();i++) {
	        s[i]=input.charAt(i);
	    }
	    for (i = input.length() - 1; i >= 0; i--) {
	          System.out.print(s[i]);
	    }
	}
}
