package Arraylogicalprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Write a Java program to print the second largest number in the array.
	

		int size,i;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter size of Array");
		size=r.nextInt();
		int a[]=new int [size];
		for(i=0;i<size;i++) {
			a[i]=r.nextInt();
		}
		System.out.println("printed Array Elements");
		for(i=0;i<size;i++) {
			System.out.println(a[i]+ " ");	
			
		}
	System.out.println("second largerst number");
	Arrays.sort(a);
	 int second=a[a.length-2];
	 System.out.println(second);
	
	}

}
