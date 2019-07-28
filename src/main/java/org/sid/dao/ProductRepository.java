package org.sid.dao;

import org.sid.entites.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ProductRepository extends MongoRepository<Product , String> {




}
