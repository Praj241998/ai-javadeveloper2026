package com.training.basic;

public class Smaller {

	public static void main(String[] args) {
		int [] arr= {30,40,50,10};
		int smaller =arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smaller)
			{
				smaller=arr[i];
			}
		}
		System.out.println("Smaller number is"+smaller);

	}

}
