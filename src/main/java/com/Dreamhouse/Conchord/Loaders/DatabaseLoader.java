package com.Dreamhouse.Conchord.Loaders;

import com.Dreamhouse.Conchord.Models.Card;
import com.Dreamhouse.Conchord.Models.Poster;
import com.Dreamhouse.Conchord.Stores.CardRepository;
import com.Dreamhouse.Conchord.Stores.PosterRepository;
import com.Dreamhouse.Conchord.Stores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.geo.Box;
import org.springframework.data.geo.Point;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner
{
  private final UserRepository userRepository;
  private final PosterRepository posterRepository;
  private final CardRepository cardRepository;

  @Autowired
  public DatabaseLoader(
    UserRepository _users, PosterRepository _posterRepository,
    CardRepository _cardRepository
  )
  {
    this.userRepository = _users;
    this.posterRepository = _posterRepository;
    this.cardRepository = _cardRepository;
  }

  @Override
  public void run(String... args) throws Exception
  {
    this.userRepository.save(new User("John-Doe-1", "Admin-Root-2", null));
    this.posterRepository.save(new Poster("BalancedFrame",
                                          "A pilot's go-to frame.",
                                          "John Doe",
                                          "2023-12-01"
    ));
    this.cardRepository.save(new Card(new Box(new Point(0, 0), new Point(0, 0)),
                                      new Point(0, 0)
    ));
  }
}