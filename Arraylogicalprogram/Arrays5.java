package Arraylogicalprogram;

public class Arrays5 {
	public static void main(String[] args) {
		/*5.	Write a java program to which prints 
		 * �There are consecutive numbers� 
		 * if there are any 3 consecutive numbers else
		 *  it prints �There are no consecutive numbers�.
		if the array has {19,10,21,22,23,9,6,11,12}
		Then since there are 3 consecutive numbers 21,22,23
		 hence it will print true.

				*/
		
		int[] arr= {19,10,21,22,23,9,6,11,12};
		boolean found=false;
		for(int i=0;i<arr.length-2;i++)
		{
			
			if(arr[i+1]==arr[i]+1 && arr[i+2]==arr[i]+2) {
				System.out.println("consecutive number found");
				System.out.println(found=true);
				System.out.println(arr[i]+"\t"+arr[i+1]+"\t"+arr[i+2]);
				
			}

			
		}
		if(found==false)
		System.out.println("not found");
	}
}
