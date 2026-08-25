package com.oops.basic;

public class Product {
	
	String[] showProducts()
	{
		String [] arr= {"Mobile","Laptop","BT Audio","Keyboard"};
		return arr;
	}
	
	void printCategories(String[] categories)
	{
		for(String categorie:categories)
		{
			System.out.println(categorie);
		}
	}
	
	String offerDetails()
	{
		return "Ugadi offers";
	}
	public static void main(String[] args)
	{
		Product product=new Product();
		String offerDetails=product.offerDetails();
		System.out.println(offerDetails);
		product.printCategories(product.showProducts());
	}

}
