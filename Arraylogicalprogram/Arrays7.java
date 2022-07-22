package Arraylogicalprogram;

import java.util.Arrays;

public class Arrays7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
Write a java program to convert 3 arrays into a single multidimensional array.
example : lets say we have 3 arrays, each of length 4.
arr1 = {3,5,7,9}
arr2 = {2,4,6,8}
arr3 = {0,3,6,9}
So create a multidimensional array to store these array.
arr4 = [ 3,5,7,9
	2,4,6,8
	0,3,6,9]
	
*/
	
	int a[]= {3,5,7,9};
	
	int b[]= {2,4,6,8};
	
	int c[]= {0,3,6,9};
	
	int A=a.length;
	int B=b.length;
	int C=c.length;
	
	int k= a.length+b.length;
	int d[]=new int [k];

	   for (int i=0;i<a.length;i++) {
		   d[i]=a[i];
	   }
		for(int i=0;i<b.length;i++) {
			d[a.length+i]=b[i];
		}
	
		System.out.println("Merage Three array");
		for(int i=0;i<d.length;i++) {			// System.out.print(d[i]+" ");
		}
	
	
	int D= d.length;
	 int k2= d.length+c.length;
	 int[] k4=new int[k2];
	 for(int i=0;i<d.length;i++)
	 {
		k4[i]=d[i];
	 }
	 for(int i=0;i<c.length;i++) {			
	 k4[d.length+i]=c[i];
		}
	
		for(int i=0;i<k4.length;i++) {
			//System.out.println(k4[i]+" ");
		}
	System.out.println(Arrays.toString(k4));	//Arrays.toString(k4);
	
	
	

	
		}
		
		
		
	
	
	}


