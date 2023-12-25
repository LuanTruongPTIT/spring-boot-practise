package com.social_x.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.social_x.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
