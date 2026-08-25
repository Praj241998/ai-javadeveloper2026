package com.training.basic;

public class SmallSecond {

	public static void main(String[] args) {
		int [] arr = {100,200,40,60,1300};
		int FirstSmallest=arr[0];
		int SecondSmallest=arr[0];
		for(int val:arr)
		{
			if(val<FirstSmallest)
			{
				FirstSmallest=val;
			}
		}
		System.out.println("First Smallest"+FirstSmallest);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<SecondSmallest)
			{
				if(arr[i]!=FirstSmallest)
				{
					SecondSmallest=arr[i];
				}
			}
		}
		System.out.println("Second Smallest"+SecondSmallest);

	}

}
