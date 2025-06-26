package com.github.luisgabrieldev.ecommerce_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.luisgabrieldev.ecommerce_api.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}