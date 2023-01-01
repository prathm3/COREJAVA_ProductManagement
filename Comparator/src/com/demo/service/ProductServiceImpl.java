package com.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	private ProductDao pdao ;

	public ProductServiceImpl() {
		pdao = new ProductDaoImpl();
	}

	@Override
	public void addProduct() {
		Scanner sc= new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter Pid");
		int pid = sc.nextInt();
		System.out.println("Enter pname");
		String name = sc.next();
		System.out.println("Enter qty");
		int qty = sc.nextInt();
		System.out.println("Enter price");
		float price = sc.nextFloat();
		System.out.println("Enter date (dd/mm/yyyy)");
		String dom = sc.next();
		Date d = null;
		try {
			d = sdf.parse(dom);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Product p = new Product(pid, name, qty, price, d);
		pdao.addProduct(p);
		
	}

	@Override
	public void removeProductByID(int id) {
		// TODO Auto-generated method stub
		pdao.removeByid(id);
		
	}

	@Override
	public void removeProductByName(String name) {
		// TODO Auto-generated method stub
		pdao.removeByName(name);
	}

	@Override
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		
		return pdao.getAll();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return pdao.find(id);
	}

	@Override
	public void sortByPrice() {
		// TODO Auto-generated method stub
		pdao.sort();
	}

	@Override
	public void findByQty(int qty) {
		// TODO Auto-generated method stub
		pdao.findByqty(qty);
	}

	@Override
	public void modifyPriceById(int id, float newPrice) {
		// TODO Auto-generated method stub
		pdao.modify(id, newPrice);
	}

	@Override
	public Product findByName(String name) {
		// TODO Auto-generated method stub
		return pdao.findName(name);
	}

	@Override
	public void sortByName() {
		// TODO Auto-generated method stub
		pdao.sortname();
	}
	
}
