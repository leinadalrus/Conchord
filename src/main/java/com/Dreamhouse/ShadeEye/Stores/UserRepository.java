package com.Dreamhouse.ShadeEye.Stores;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepository extends CrudRepository<User, Long>
{}
