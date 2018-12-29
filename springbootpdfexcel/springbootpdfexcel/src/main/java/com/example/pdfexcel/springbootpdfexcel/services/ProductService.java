package com.example.pdfexcel.springbootpdfexcel.services;

import com.example.pdfexcel.springbootpdfexcel.entities.Product;

public interface ProductService {

    Iterable<Product> findAll();

    Product find(long id);
}
