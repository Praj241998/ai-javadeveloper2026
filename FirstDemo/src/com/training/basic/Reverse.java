package com.training.basic;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		String Reverse="";
		String OriginalNum=String.valueOf(num);
		for(int i=OriginalNum.length()-1;i>=0;i--)
		{
			char Rev = OriginalNum.charAt(i);
		    Reverse=Reverse+Rev;
		}
		
		System.out.println(Reverse);

	}

}
