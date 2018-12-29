package com.example.pdfexcel.springbootpdfexcel.services;

import com.example.pdfexcel.springbootpdfexcel.entities.Product;
import com.example.pdfexcel.springbootpdfexcel.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;


    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product find(long id) {
        return repository.findById(id).orElse(null);
    }
}
