package com.Dreamhouse.Conchord.Controllers;//
// created by David on: 2023-12-22
//

import com.Dreamhouse.Conchord.Models.Card;
import com.Dreamhouse.Conchord.Stores.CardRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CardController
{
  private CardRepository cardRepository;

  public CardController(CardRepository repository)
  {
    this.cardRepository = repository;
  }

  // Return Enumerator over Enumerable
  @GetMapping("/cards")
  Iterable<Card> cards()
  {
    return cardRepository.findAll();
  }

  @PutMapping("/cards/{id}")
  Card updateCardByID(@RequestBody Card _card, @PathVariable Long id)
  {
    return cardRepository.findById(id).map(card -> {
      card.setDimensions(_card.getDimensions());
      card.setPosition(_card.getPosition());
      return card;
    }).orElseGet(() -> {
      _card.setID(id);
      return cardRepository.save(_card);
    });
  }
}
