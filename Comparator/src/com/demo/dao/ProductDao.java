package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	void addProduct(Product p);

	void removeByid(int id);

	void removeByName(String name);

	List<Product> getAll();

	Product find(int id);

	void sort();

	void findByqty(int qty);

	void modify(int id, float newPrice);

	Product findName(String name);

	void sortname();

}
