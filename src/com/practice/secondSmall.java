package com.practice;
import java.util.*;
public class secondSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, temp;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        n = Sc.nextInt();
        Sc.close();
        int a[] = new int[n];
        System.out.println("Enter the elements in array : ");
        for (int i = 0; i < n; i++) 
        {
            a[i] = Sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The Second Smallest element in the array is :"+a[1]);

	}
}

