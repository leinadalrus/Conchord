package com.Dreamhouse.Sumika.Shared;

import com.Dreamhouse.Sumika.Models.UserProfile;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserProfile, Long>
{}
