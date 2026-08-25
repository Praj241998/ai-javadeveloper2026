package com.training.basic;

public class Greater {

	public static void main(String[] args) {
		int [] arr= {10,30,40,50};
		int greater=arr[0];
		for(int val:arr)
		{
			if(val>greater)
			{
				greater=val;
			}
		}
		System.out.println("Greater Number is"+greater);

	}

}
