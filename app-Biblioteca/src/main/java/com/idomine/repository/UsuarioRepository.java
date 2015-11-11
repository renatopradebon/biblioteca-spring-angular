package com.idomine.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.idomine.model.Usuario;

@RepositoryRestResource(collectionResourceRel = "usuario", path = "usuario", exported = true)
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {

}
