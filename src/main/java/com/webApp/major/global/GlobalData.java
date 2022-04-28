package com.webApp.major.global;

import java.util.ArrayList;
import java.util.List;

import com.webApp.major.model.Product;

public class GlobalData {

	
	public static List<Product> cart;
	
	static
	{
		cart = new ArrayList<Product>();
	}
}
