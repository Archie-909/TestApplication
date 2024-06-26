package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {

}
