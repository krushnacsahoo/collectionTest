package com.hashmap.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Order order1 = new Order(1, "sahoo");
		Order order2 = new Order(12, "sahoo");
		Order order3 = new Order(11, "sahoo");
		System.out.println("order1 hashcode is :" + order1.hashCode() );
		System.out.println("order2 hashcode is :" + order2.hashCode() );
		System.out.println("order3 hashcode is :" + order3.hashCode() );
		Map<Order, Integer> orders = new HashMap<Order, Integer>();
		
		orders.put(order1, 1001);
		orders.put(order2, 100);
		//orders.put(order3, 1003);
		orders.put(new Order(2, "sahoo"), 1004);
		
//		
//		System.out.println("size is :" + orders.size());
//		System.out.println("Orders is :" + orders);
//		order2.setId(1);
//		System.out.println("order2 hashcode is :" + order2.hashCode() );
//		
//		System.out.println("After update size is :" + orders.size());
//		System.out.println("Orders is :" + orders);
//		orders.remove(order2);
//		orders.remove(order1);
		
		System.out.println("After update size is :" + orders.size());
		System.out.println("Orders is :" + orders);
		
		//String s1 = "hihihihihihihihi";
		// System.out.println(s1.substring(50)); //error
		//System.out.println(s1.substring(s1.length())); // empty string

		//-------------------------- set
	//	Set<Order> set = new HashSet<Order>();
//		set.add(order1);
//		set.add(order2);
//		set.add(order3);
		System.out.println("===========================");
		orders.forEach((k,v) -> {
			
			orders.put(new Order(3,"Alok"), 5000);
			k.setName("krushna");
			System.out.println("hashcode Key : " + k.hashCode() );
			System.out.println("Item : " + k + " Count : " + v);
		}
		);
		System.out.println("Orders is :" + orders);
 
		
	}

}

class Order {
	int id;

	String name;
	public Order(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + "]";
	}

}
