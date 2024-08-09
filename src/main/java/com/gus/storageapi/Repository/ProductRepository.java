package com.gus.storageapi.Repository;

import com.gus.storageapi.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
