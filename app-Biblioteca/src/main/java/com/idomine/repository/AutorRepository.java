package com.idomine.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.idomine.model.Autor;

@RepositoryRestResource(collectionResourceRel = "autor", path = "autor", exported = true)
public interface AutorRepository extends PagingAndSortingRepository<Autor, Long> {

}
