package com.demo.cmp;

import java.util.Comparator;

import com.demo.beans.Product;

public class NameComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.getName().equals(o2.getName())) {
			return o1.getPid() - o2.getPid();
		}else {
			o1.getName().compareTo(o2.getName());
		}
		return 0;
	}

}
