package com.Dreamhouse.Sumika.Services;

import com.Dreamhouse.Sumika.Models.Poster;
import com.Dreamhouse.Sumika.Models.RadarService;
import com.Dreamhouse.Sumika.Models.UserProfile;
import com.Dreamhouse.Sumika.Shared.PosterRepository;
import com.Dreamhouse.Sumika.Shared.RadarRepository;
import com.Dreamhouse.Sumika.Shared.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner
{
  private final UserRepository userRepository;
  private final PosterRepository posterRepository;
  private final RadarRepository radarRepository;

  @Autowired
  public DatabaseLoader(UserRepository _users, PosterRepository _posters, RadarRepository _radars)
  {
    this.userRepository = _users;
    this.posterRepository = _posters;
    this.radarRepository = _radars;
  }

  @Override
  public void run(String... args) throws Exception
  {
    this.userRepository.save(new UserProfile(0, "John-Doe-1"));
    this.posterRepository.save(new Poster());
    this.radarRepository.save(new RadarService());
  }
}
