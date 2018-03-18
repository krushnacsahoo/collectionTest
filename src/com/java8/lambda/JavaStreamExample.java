package com.java8.lambda;

import java.util.*;
import java.util.stream.Collectors;

class ProductData {
	int id;
	String name;
	float price;

	public ProductData(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class JavaStreamExample {
	public static void main(String[] args) {
		List<ProductData> productsList = new ArrayList<ProductData>();
		// Adding Products
		productsList.add(new ProductData(1, "HP Laptop", 25000f));
		productsList.add(new ProductData(2, "Dell Laptop", 30000f));
		productsList.add(new ProductData(3, "Lenevo Laptop", 28000f));
		productsList.add(new ProductData(4, "Sony Laptop", 28000f));
		productsList.add(new ProductData(5, "Apple Laptop", 90000f));
		List<Float> productPriceList2 = productsList.stream().filter(p -> p.price > 30000)// filtering data
				.map(p -> p.price) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList2);
	}
}