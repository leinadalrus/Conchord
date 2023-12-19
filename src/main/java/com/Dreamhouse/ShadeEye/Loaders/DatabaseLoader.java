package com.Dreamhouse.ShadeEye.Loaders;

import com.Dreamhouse.ShadeEye.Models.Poster;
import com.Dreamhouse.ShadeEye.Models.RadarChart;
import com.Dreamhouse.ShadeEye.Shared.PosterRepository;
import com.Dreamhouse.ShadeEye.Shared.RadarChartRepository;
import com.Dreamhouse.ShadeEye.Shared.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner
{
  private final UserRepository userRepository;
  private final PosterRepository posterRepository;
  private final RadarChartRepository radarChartRepository;

  @Autowired
  public DatabaseLoader(
    UserRepository _users, PosterRepository _posterRepository,
    RadarChartRepository _radarChartRepository
                       )
  {
    this.userRepository = _users;
    this.posterRepository = _posterRepository;
    this.radarChartRepository = _radarChartRepository;
  }

  @Override
  public void run(String... args) throws Exception
  {
    this.userRepository.save(new User("John-Doe-1", "Admin-Root-2", null));
    this.posterRepository.save(
      new Poster("BalancedFrame", "A pilot's go-to frame.", "John Doe",
                 "2023-12-01"
      ));
    this.radarChartRepository.save(new RadarChart());
  }
}