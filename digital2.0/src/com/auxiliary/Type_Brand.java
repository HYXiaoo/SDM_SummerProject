package com.auxiliary;

import java.util.ArrayList;

import com.entity.ProductType;


public class Type_Brand {
	ProductType type;
	ArrayList<String> brandList = new ArrayList<String>();
	
	public ProductType getType() {
		return type;
	}
	public void setType(ProductType type) {
		this.type = type;
	}
	public ArrayList<String> getBrandList() {
		return brandList;
	}
	public void setBrandList(ArrayList<String> brandLis) {
		this.brandList = brandLis;
	}

}
