package com.eco.mx.mitouserservice.service.repository;


import com.eco.mx.mitouserservice.model.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.validation.annotation.Validated;

import java.util.List;
//el page devuelve un json con los elementos que devuelve el query
@Validated
@RepositoryRestResource(path = "user")
public interface UserRepository extends CrudRepository<UserEntity, String>, PagingAndSortingRepository<UserEntity, String> {

    @RestResource(path = "email")
    List<UserEntity> getAllByEmail(String email);
}
