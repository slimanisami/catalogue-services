package org.sid;

import org.sid.dao.CategoryRepository;
import org.sid.dao.ProductRepository;
import org.sid.entites.Category;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.stream.Stream;

@SpringBootApplication
public class CatalogueServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogueServicesApplication.class, args);
	}


	@Bean
	CommandLineRunner start(CategoryRepository categoryRepository, ProductRepository productRepository){


	return args -> {

		categoryRepository.deleteAll();
		Stream.of("Ordinateur","Imprimente").forEach(c->{


		categoryRepository.save(new Category("C1",c,new ArrayList<>()));

		});
		categoryRepository.findAll().forEach(System.out::println);

	};

	}

}
