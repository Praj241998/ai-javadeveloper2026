package com.training.basic;

import java.util.HashMap;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,20,40,40,90,100,70,45,45,50};
		HashMap<Integer,Integer> dup=new HashMap();
		for(int val:arr)
		{
			if(dup.containsKey(val))
			{
				dup.put(val,dup.get(val)+1);
			}
			else
			{
				dup.put(val,1);
			}
		}
		
		System.out.println(dup);
		

	}

}
