package com.training.basic;

public class Sum {

	public static void main(String[] args) {
    int [] arr= {10,50,80,90,110,45,55};
    int sum=0;
    for(int val:arr)
    {
    	sum=sum+val;
    }
    System.out.println("Sum of Array is"+sum);
    System.out.println("Avg of an Array is"+sum/arr.length);
    

	}

}
