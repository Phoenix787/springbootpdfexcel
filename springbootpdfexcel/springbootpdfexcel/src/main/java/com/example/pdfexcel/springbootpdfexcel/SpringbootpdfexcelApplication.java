package com.example.pdfexcel.springbootpdfexcel;

import com.example.pdfexcel.springbootpdfexcel.entities.Product;
import com.example.pdfexcel.springbootpdfexcel.repositories.ProductRepository;
import com.example.pdfexcel.springbootpdfexcel.services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Locale;

@SpringBootApplication
public class SpringbootpdfexcelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootpdfexcelApplication.class, args);
	}

//	@Bean
	public CommandLineRunner init(ProductRepository repository) {
		return args -> {

			//Product product = productService.find(1l);
			service.exportToPDF();
//			repository.save(new Product("Product 1", 2, new BigDecimal(23.3), "Category 1"));
//			repository.save(new Product("Product 2", 5, new BigDecimal(30.00), "Category 2"));
//			repository.save(new Product("Product 3", 12, new BigDecimal(45.00), "Category 2"));
//			repository.save(new Product("Product 4", 4, new BigDecimal(80.23), "Category 4"));
		};
	}

	@Resource
	private ProductService productService;

	@Resource
	private InvoiceService service;


}

