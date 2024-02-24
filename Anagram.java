package com.deepclasses.java;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	
	String s1 = "Ram ohan";
	String s2 = "naho Mar";
	boolean flag = true;
	char[] ch1 = s1.replace(" ","").toLowerCase().toCharArray();
	char[] ch2 = s2.replace(" ","").toLowerCase().toCharArray();
//	s1 = s1.toLowerCase();
//	s2 = s2.toLowerCase();
//	char ch1[] = s1.toCharArray();
//  char ch2[] = s2.toCharArray();
	 
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	for(int i = 0; i<= ch1.length-1;i++)
	{
		if(ch1[i]!=ch2[i])
		{
			flag = false;
			break;
		}
		
	}
	 if(flag==true) 
	 {
	System.out.println("It is Anagram");
	 }
	 else
	 {
		 System.out.println("it is not anagram");
	 }
}
}
