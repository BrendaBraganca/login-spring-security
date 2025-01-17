package com.example.login_authorization_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.login_authorization_api.domain.User;

public interface UserRepository extends JpaRepository<User, String>{

}
