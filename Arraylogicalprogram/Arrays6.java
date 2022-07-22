package Arraylogicalprogram;

import java.util.Arrays;

public class Arrays6 {

	public static void main(String[] args) {
/*
 6.	Write a Java program which will create a 
 concatenated and sorted array of two arrays.
Lets say we have array1 = {3,5,1,0,4}
and array2 = {7,9,8,6,2}
Then the program will create a final 
array which will be 
array3 = {0,1,2,3,4,5,6,7,8,9}  
*/
   int a[]=	 {3,5,1,0,4};
   
   int b[]= {7,9,8,6,2};
 
   int A=a.length;
   int B=b.length;
   int C=A+B;
   int c[]=new int [C]; 
   
   for (int i=0;i<a.length;i++) {
	   c[i]=a[i];
   }
	for(int i=0;i<b.length;i++) {
		c[a.length+i]=b[i];
	}
//	System.out.println("Merage Two array");
//	for(int i=0;i<c.length;i++) {
//		System.out.print(c[i]+" ");
//	}
	
	 Arrays.sort(c);
	// System.out.println("Arrays.sort method array print");
		for ( int i=0;i<c.length;i++) {
		System.out.println( c[i]+" ");	
		}
	
		System.out.print(Arrays.toString(c));
	
	}

}
