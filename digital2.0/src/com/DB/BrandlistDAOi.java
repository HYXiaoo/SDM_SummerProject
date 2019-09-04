package com.DB;

import java.util.ArrayList;

import com.entity.ProductType;

public interface BrandlistDAOi {
	public ArrayList<String> getBrandlist(ProductType type);
}
