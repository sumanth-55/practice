package com.practice;

import java.util.*;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		sc.close();
		if(checkNumber(n)) {
			System.out.println(n+" "+"is power of 2");
		}else {
			System.out.println(n+" "+"is not a power of 2");
		}
	}
public static boolean checkNumber(int n) {
	if(n%2!=0) {
		return false;
	}
	else {
		for(int i=0;i<=n;i++) {
			if(Math.pow(2, i)==n)
				return true;
		}
	}
	return false;
}
}
