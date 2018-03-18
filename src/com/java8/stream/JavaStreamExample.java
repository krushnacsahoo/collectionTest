package com.java8.stream;

import java.util.*;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class JavaStreamExample {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		List<String> productPriceList2 = productsList.stream().filter(p -> p.price < 30000)// filtering data
				.map(p -> p.name) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList2);
		
		 int number = 0;
	        System.out.println("number = " + number);
	        System.out.println(Integer.toBinaryString(number));

	        // Using the ~ operator inverts the number by change the
	        // every "0" to "1" and every "1" to "0".
	        // 00000000000000000000000000001000
	        // 11111111111111111111111111110111
	        //
	        int invertedNumber = ~number;
	        System.out.println("invertedNumber = " + invertedNumber);
	        System.out.println(Integer.toBinaryString(invertedNumber));
	        invertedNumber = invertedNumber << 1;
	        System.out.println("invertedNumber = " + invertedNumber);
	        System.out.println(Integer.toBinaryString(invertedNumber));
	}
}