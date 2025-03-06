package com.Product.Products.Repository;

import com.Product.Products.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepo extends JpaRepository<Products, Long> {
    Optional<Products> findById(Long id);


}
