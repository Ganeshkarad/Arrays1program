package Arraylogicalprogram;

import java.util.Arrays;
import java.util.HashSet;

public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to remove the duplicate numbers from an array.

  int a[]= {10,12,8,9,8,4,5,6,10,4,1};
	 Arrays.sort(a);
  

		int j=0;
		for (int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1])
			{
				
				a[j]=a[i];
				j++;
			}
		}
	a[j]=a[a.length-1];
	
	for(int i=0;i<j+1;i++) {
		System.out.println(a[i]);
	}
	
	System.out.println("method 2");
	
	HashSet<Integer>hs=new HashSet<>();
	
	for(int i=0;i<a.length;i++) {
		hs.add(a[i]);
	}
	
	 for(int no:hs) {
		 System.out.println(no+" ");
	 }
	 
	 
	 
	 
	 
	
	
	
	}

	}
