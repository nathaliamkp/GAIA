package br.com.gaia.admin.repository;

//package com.example.accessingdatamysql;

import br.com.gaia.admin.model.Usuario;
import org.springframework.data.repository.CrudRepository;

//import com.example.accessingdatamysql.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<Usuario, Integer> {

}