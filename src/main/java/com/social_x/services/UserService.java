package com.social_x.services;

import org.springframework.stereotype.Service;

import com.social_x.model.UserModel;
import com.social_x.repository.UserRepository;

@Service()
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void getStudents(UserModel user) {
    System.out.println(user);

  }
}
