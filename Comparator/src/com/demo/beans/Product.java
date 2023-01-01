package com.demo.beans;

import java.util.Date;
import java.util.Objects;

public class Product implements Comparable<Product>{
	
	private int pid;
	private String name;
	private int qty;
	private float price;
	private Date dom;
	public Product() {
		super();
	}
	public Product(int pid, String name, int qty, float price, Date pom) {
		super();
		this.pid = pid;
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.dom = pom;
	}
	public Product(int id) {
		// TODO Auto-generated constructor stub
		this.pid = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getDom() {
		return dom;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
	@Override
	public boolean equals(Object obj) {
		Product other = (Product) obj;
		return pid == other.pid;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", qty=" + qty + ", price=" + price + ", dom=" + dom + "]";
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return (int)(this.price - o.getPrice());
	}
	
	
}
