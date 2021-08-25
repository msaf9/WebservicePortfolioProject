package com.project.webservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.webservice.entity.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}
