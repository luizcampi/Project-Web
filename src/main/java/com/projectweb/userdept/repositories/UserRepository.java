package com.projectweb.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectweb.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
