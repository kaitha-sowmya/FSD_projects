package com.sportyshoes.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoes.entity.*;


public interface ProductRepo extends JpaRepository<Product, Long>{

}
