package com.Dreamhouse.ShadeEye.Loaders;

import com.Dreamhouse.ShadeEye.Shared.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner
{
  private final UserRepository userRepository;

  @Autowired
  public DatabaseLoader(UserRepository _users)
  {
    this.userRepository = _users;
  }

  @Override
  public void run(String... args) throws Exception
  {
    this.userRepository.save(new User("John-Doe-1", "Admin-Root-2", null));
  }
}