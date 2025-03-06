package com.Product.Products.Controllers;

import com.Product.Products.Entity.Products;
import com.Product.Products.ProductDto.ProductDto;
import com.Product.Products.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Products")
public class ProductControllers {
    @Autowired
    private ProductService service;

   @PostMapping("/saveProducts")
    public ResponseEntity<ProductDto> saveProducts(@RequestBody ProductDto productDto){
        ProductDto p1=service.saveProduct(productDto);
        return new ResponseEntity<>(p1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductDto>getProduct(@PathVariable Long id) {
        ProductDto p2 = service.getProduct(id);
        return new ResponseEntity<>(p2, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDto>updateProduct(
            @PathVariable Long id,
            @RequestBody ProductDto productDto){
        ProductDto p3=service.updateProduct(id,productDto);
        return new ResponseEntity<>(p3,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Products>deleteProducts(@PathVariable Long id){
        Products p4=service.deleteProduct(id);
        return new ResponseEntity<>(p4,HttpStatus.OK);
    }


}
