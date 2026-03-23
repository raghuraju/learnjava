package com.raghubuilds.learnjava.api.controller;

import com.raghubuilds.learnjava.core.model.User;
import com.raghubuilds.learnjava.api.dto.UserDto;
import com.raghubuilds.learnjava.core.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController{
  private final UserRepository userRepository;

  public UserController(UserRepository userRepository){
    this.userRepository = userRepository;
  }

  @GetMapping
  public Iterable<UserDto> getAllUsers(){
    return userRepository.findAll().stream().map(user -> user.toDto()).toList();
  }
}
