package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	void addProduct();

	void removeProductByID(int id);

	void removeProductByName(String name);

	List<Product> getProduct();

	Product findById(int id);

	void sortByPrice();

	void findByQty(int qty);

	void modifyPriceById(int id, float newPrice);

	Product findByName(String name);

	void sortByName();

}
