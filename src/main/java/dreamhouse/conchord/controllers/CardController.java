package dreamhouse.conchord.controllers;

import dreamhouse.conchord.models.Card;
import dreamhouse.conchord.stores.CardRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class CardController
{
  private final CardRepository cardRepository;

  CardController(CardRepository repository)
  {
    this.cardRepository = repository;
  }
}
