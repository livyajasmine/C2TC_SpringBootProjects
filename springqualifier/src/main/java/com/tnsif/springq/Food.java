package com.tnsif.springq;

import org.springframework.stereotype.Component;

@Component
public class Food implements ShoppingMall{
	public void purchase() 
	{
		System.out.println("I am goint to ordering the foos...:");
	}

}
