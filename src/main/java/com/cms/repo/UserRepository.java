package com.cms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
