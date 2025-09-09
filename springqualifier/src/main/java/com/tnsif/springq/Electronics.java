package com.tnsif.springq;

import org.springframework.stereotype.Component;

@Component
public class Electronics implements ShoppingMall {
	public void purchase()
	{
		System.out.println("I am goint to purchase some widgets...:");
	}

}

