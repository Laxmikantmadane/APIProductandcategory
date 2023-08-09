package com.Category.and.Product.API.CategoryandProduct.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Category.and.Product.API.CategoryandProduct.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
