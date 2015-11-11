package com.idomine.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.idomine.model.Livro;

@RepositoryRestResource(collectionResourceRel = "livro", path = "livro", exported = true)
public interface LivroRepository extends PagingAndSortingRepository<Livro, Long> {

}
