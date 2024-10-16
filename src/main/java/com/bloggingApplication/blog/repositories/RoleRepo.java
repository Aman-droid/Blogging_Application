package com.bloggingApplication.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloggingApplication.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
