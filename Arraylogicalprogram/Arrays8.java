package Arraylogicalprogram;

public class Arrays8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a java program to create a 2D array 
//		which has 3 columns and 4 rows and display
//		the sum of each rows and columns.
//		Example : consider below array
//		2	6	8
//		3	7	0
//		4	5	3
//		1	0	9


int[] []a= new int[][] {
	{2,6,8},{3,7,0},{4,5,3},{1,0,9}
};
 int row =a.length, col=a[0].length;
		//int rowsum=0, colsum=0;
	//row	
for(int i=0;i<row;i++)
{int rowsum=0;
  for (int j=0;j<col;j++) {
	rowsum=rowsum+a[i][j];  
  }
  System.out.println("sum of Row "+(i+1)+"=" +rowsum);
  }
	//col	
//for(int i=0;i<col;i++)
//{    int colsum=0;
//  for (int j=0;j<col;j++) {
//	colsum=colsum+a[i][j];  
//  }
//  System.out.println("sum of col "+(i+1)+"=" +colsum);
//  }	
//		
for(int i = 0; i < col; i++){  
    int sumCol = 0;  
    for(int j = 0; j < row; j++){  
      sumCol = sumCol + a[j][i];  
    }  
   // printf("Sum of %d column: %d\n", (i+1), sumCol);  
System.out.println("sum of col "+(i+1)+"=" +sumCol);
}





	}

}
