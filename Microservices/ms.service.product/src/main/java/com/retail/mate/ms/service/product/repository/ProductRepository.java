package com.retail.mate.ms.service.product.repository;

import com.retail.mate.ms.service.product.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
