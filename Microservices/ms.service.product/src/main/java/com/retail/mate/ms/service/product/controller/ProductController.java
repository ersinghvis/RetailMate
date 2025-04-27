package com.retail.mate.ms.service.product.controller;
import com.retail.mate.ms.service.product.dto.ProductDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @GetMapping("/{productId}")
    public ProductDTO getProductById(@PathVariable (name = "productId") long productId ){
        ProductDTO product = new ProductDTO();
        return product;
    }

    @GetMapping("/getProducts")
    public ResponseEntity<?> getProducts(){
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PostMapping("/addProduct")
    public ResponseEntity<?> addProduct(@RequestBody ProductDTO product){
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PostMapping("/addProducts")
    public ResponseEntity<?> addProductList(@RequestBody List<ProductDTO> products){
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("delete/{productId}")
    public ResponseEntity<?> deleteProductById(@PathVariable (name="productId") long productId){
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/products")
    public ResponseEntity<Void> deleteProducts(@RequestBody List<Long> productIds) {
        return ResponseEntity.noContent().build();
    }

}
