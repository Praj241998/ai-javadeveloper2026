package com.training.basic;

public class LargeSecond {

	public static void main(String[] args) {
	 int [] arr= {1,40,50,100,600};
	 int FirstLargest=arr[0];
	 int SecondLargest=arr[0];
	 for(int val:arr)
	 {
		 if(val>FirstLargest)
		 {
			 FirstLargest=val;
		 }
	 }
	 System.out.println("First Largest"+FirstLargest);
	 
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>SecondLargest)
		{
			if(arr[i]!=FirstLargest)
			{
				SecondLargest=arr[i];
			}
		}
		 
		
	}
	System.out.println("Second Largest"+SecondLargest);

	}

}
