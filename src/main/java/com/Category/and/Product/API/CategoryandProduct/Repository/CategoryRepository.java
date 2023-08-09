package com.Category.and.Product.API.CategoryandProduct.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Category.and.Product.API.CategoryandProduct.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
