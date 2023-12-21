package com.Dreamhouse.ShadeEye.Annals;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.security.core.userdetails.User;

public record AccountData(
  @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id, UserDetail userDetail, User user)
{}
