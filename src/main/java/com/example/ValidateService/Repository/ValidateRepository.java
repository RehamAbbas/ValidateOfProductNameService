package com.example.ValidateService.Repository;

import com.example.ValidateService.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidateRepository extends JpaRepository<Product, Integer> {

    boolean existsByName(String name);
}
