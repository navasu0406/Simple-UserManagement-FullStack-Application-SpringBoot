package com.na.full_stack_backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.na.full_stack_backend.model.User;

public interface UserRepository extends JpaRepository <User,Long>{
           
}
