package Arraylogicalprogram;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	Write a Java program to print the average of
	 all the items in the array.

	 */
	
	
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int sum=0; double avg;
	
	for (int i=0;i<a.length;i++) {
		sum=a[i]+sum;
	}
	avg=sum/5;
	System.out.println(sum+" "+avg);
	
	
	
	}

}
