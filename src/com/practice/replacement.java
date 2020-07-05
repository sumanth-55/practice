package com.practice;
import java.util.*;

public class replacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch; 
		String s1="";
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your string");
	    String s=sc.nextLine();
	    for(int i=0;i<s.length();i++)
	    {
	        ch=s.charAt(i);
	        int a=ch;
	        if(!(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='U'||ch=='u'))
	        {
	            ch=(char)(a+1);
	            s1=s1+ch;
	        }
	        else
	        {
	            s1=s1+ch;
	        }
	    }
	       System.out.println(s1);
	    }
	}

