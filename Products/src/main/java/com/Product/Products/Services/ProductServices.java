package com.Product.Products.Services;

import com.Product.Products.Entity.Products;
import com.Product.Products.ProductDto.ProductDto;
import com.Product.Products.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServices implements ProductService{
    @Autowired
    private ProductRepo productRepo;

    @Override
    public ProductDto saveProduct(ProductDto productDto) {
        Products products=new Products(
                productDto.getId(),
                productDto.getName(),
                productDto.getItems(),
                productDto.getPrice()
        );
        Products product1=productRepo.save(products);
        ProductDto productDto1=new ProductDto(
                product1.getId(),
                product1.getName(),
                product1.getItems(),
                product1.getPrice()
        );
        return productDto1;
    }

    @Override
    public ProductDto getProduct(Long id) {
        Products pro= productRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found: " + id));
        ProductDto productDto=new ProductDto(
              pro.getId(),
              pro.getName(),
              pro.getItems(),
              pro.getPrice());
        return productDto;
    }

    @Override
    public ProductDto updateProduct(Long id, ProductDto productDto) {
        Products products=productRepo.findById(id)
                .orElseThrow(()-> new RuntimeException("Products does not throws exception :"+id));

        products.setName(productDto.getName());
        products.setItems(productDto.getItems());
        products.setPrice(productDto.getPrice());
        Products updateProduct=productRepo.save(products);
        return new ProductDto(
                updateProduct.getId(),
                updateProduct.getName(),
                updateProduct.getItems(),
                updateProduct.getPrice()
        );
    }

    @Override
    public Products deleteProduct(Long id) {
       Products products=productRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The Products is not present :"+id));
        productRepo.deleteById(id);
        return products;

    }
}
