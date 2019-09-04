package com.entity;

import java.util.HashSet;
import java.util.Set;

public class ProductType implements Cloneable{
	int id; 
	String name;
	
	Set<Object> productInfoSet=new HashSet<Object>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Object> getProductInfoSet() {
		return productInfoSet;
	}
	public void setProductInfoSet(Set<Object> productInfoSet) {
		this.productInfoSet = productInfoSet;
	}
	public ProductType() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public ProductType(String name) {
		super();
		this.name = name;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ProductType pt=(ProductType) super.clone();
		pt.setName(name);
		pt.setId(id);
		return pt;
	}
	
	
	
}
