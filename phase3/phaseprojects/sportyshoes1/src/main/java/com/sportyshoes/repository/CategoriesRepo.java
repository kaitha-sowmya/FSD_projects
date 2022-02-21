package com.sportyshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoes.entity.Categories;

public interface CategoriesRepo extends JpaRepository<Categories, Long> {

}
