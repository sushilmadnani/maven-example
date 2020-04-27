package com.sushil.product.bo;

import com.sushil.product.dto.Product;

public interface ProductBO {
	
	public void create(Product product);
	
	public Product findProduct(int id);

}
