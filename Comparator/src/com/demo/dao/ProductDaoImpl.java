package com.demo.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Product;
import com.demo.cmp.NameComparator;

public class ProductDaoImpl implements ProductDao {
	private static List<Product> plist;
	static {
		plist = new ArrayList<>();
	}
	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		plist.add(p);
	}
	@Override
	public void removeByid(int id) {
		// TODO Auto-generated method stub
		plist.remove(new Product(id));
	}
	@Override
	public void removeByName(String name) {
		int id = searchByName(name);
		removeByid(id);
	}
	
	private int searchByName(String name) {
		// TODO Auto-generated method stub
		for(Product p : plist) {
			if(p.getName().equals(name)) return p.getPid();
		}
		return -1;	
	}
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		
		return plist;
	}
	@Override
	public Product find(int id) {
		// TODO Auto-generated method stub
		int index = plist.indexOf(new Product(id));
		return plist.get(index);
	}
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		Collections.sort(plist);
	}
	@Override
	public void findByqty(int qty) {
		// TODO Auto-generated method stub
		List<Product> pl = new ArrayList<>();
		for(Product p : plist) {
			if(p.getQty() > qty) {
				pl.add(p);
			}
		}
//		plist.stream().filter(x -> x.getQty() > qty).collect(Collectors.toList());
	}
	@Override
	public void modify(int id, float newPrice) {
		// TODO Auto-generated method stub
		int i = plist.indexOf(new Product(id));
		plist.get(i).setPrice(newPrice);
	}
	@Override
	public Product findName(String name) {
		// TODO Auto-generated method stub
		for(Product p: plist) {
			if(p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}
	@Override
	public void sortname() {
		// TODO Auto-generated method stub
		plist.sort(new NameComparator());
	}
	
	
	
	
}
