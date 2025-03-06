package com.Product.Products.Services;

import com.Product.Products.Entity.Products;
import com.Product.Products.ProductDto.ProductDto;

public interface ProductService {
  ProductDto saveProduct(ProductDto productDto);
   ProductDto getProduct(Long id);
    ProductDto updateProduct(Long id,ProductDto productDto);
    Products deleteProduct(Long id);
}
