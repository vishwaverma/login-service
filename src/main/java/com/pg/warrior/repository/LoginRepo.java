package com.pg.warrior.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pg.warrior.Entity.User;

public interface LoginRepo extends JpaRepository<User, Integer> {

}
