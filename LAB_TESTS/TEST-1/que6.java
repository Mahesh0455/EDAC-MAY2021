// program odd even numbers

import java.util.*;
class que6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array in reverese order:");
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
		
		
		
		
	}
	
	
	
	
	
}