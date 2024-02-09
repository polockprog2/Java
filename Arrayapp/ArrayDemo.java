import java.lang.*;

public class ArrayDemo
{
	public static void main(String args[])
	{
		//1st approach
		
		int arr1[] = new int [5];		//int []arr1 = new int [5];
		
		arr1[0] = 11;
		arr1[3] = 18;
		
		//2nd approcah
		
		int arr2[];
		int size = arr1[3] / 6 ;
		arr2 = new int [size];
		
		arr2[0] = 11;
		arr2[2] = 15;
		
		
		//3rd approach
		
		int arr3[] = new int [] {11,22,33,44};
		
		//4th approach
		int arr4[] = {1,2,3,4,5};
		
		
		System.out.println(arr1[3]);
		System.out.println("-----------------------");
		
		for(int i = 0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("-----------------------");
		int index = 0;
		
		while(index<arr2.length)
		{
			System.out.println(arr2[index]);
			index++;
		}
		System.out.println("-----------------------");
		
		int count = 0;
		
		do
		{
			System.out.println(arr3[count]);
			count++;
		}while(count<arr3.length);
		System.out.println("-----------------------");
		
		int arr5[][] = new int [3][3];
		
		arr5[0][0] = 11;
		arr5[1][2] = 18;
		arr5[2][1] = 15;
		
		for(int row = 0; row<3; row++)
		{
			for(int col = 0; col<3; col++)
			{
				System.out.print(arr5[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		int arr7[][] = new int [][]{{1,2,3}, {4,5,6}};
		
		for(int row = 0; row<arr7.length; row++)
		{
			for(int col = 0; col<arr7[row].length; col++)
			{
				System.out.print(arr7[row][col] + "\t");
			}
			System.out.println();
		}
	}
}