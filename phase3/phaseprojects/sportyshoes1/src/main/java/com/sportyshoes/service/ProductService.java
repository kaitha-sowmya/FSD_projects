package com.sportyshoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.entity.Categories;
import com.sportyshoes.entity.Product;
import com.sportyshoes.repository.ProductRepo;

@Service
public class ProductService {
	@Autowired
	public ProductRepo prodrepo;
	
	public List<Product> listAll()
	{
		return prodrepo.findAll();
	}
	
	public void save(Product product)
	{
		prodrepo.save(product);
	}

}