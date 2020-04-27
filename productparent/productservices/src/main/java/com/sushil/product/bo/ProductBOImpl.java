package com.sushil.product.bo;

import com.sushil.product.dao.ProductDAO;
import com.sushil.product.dao.ProductDAOImpl;
import com.sushil.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	ProductDAO dao;
	
		
	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	@Override
	public void create(Product product) {
		dao.create(product);

	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
