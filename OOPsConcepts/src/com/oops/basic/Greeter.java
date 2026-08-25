package com.oops.basic;

public class Greeter {
	
	void printMessage(String...names)
	{
		for(String name :names)
		{
			System.out.println("Have a great day"+" "+name);
		}
		
	}
    void printMessage(String name,String...messages)
    {
    	for(String message:messages)
    	{
    		System.out.println(message+" "+name);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeter = new Greeter();
		String [] arr= {"Prajwal","Ujwal"};
		String [] brr= {"Hi","How are you","Nice to meet you","Okay bye bye"};
		greeter.printMessage(arr);
		greeter.printMessage("SAM", brr);
		

	}

}
