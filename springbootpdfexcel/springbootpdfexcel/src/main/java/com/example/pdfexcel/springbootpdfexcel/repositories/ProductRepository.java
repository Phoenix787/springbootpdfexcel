package com.example.pdfexcel.springbootpdfexcel.repositories;

import com.example.pdfexcel.springbootpdfexcel.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
