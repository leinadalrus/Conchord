package com.Dreamhouse.Conchord.Controllers;//
// created by David on: 2023-12-22
//

import com.Dreamhouse.Conchord.Models.Card;
import com.Dreamhouse.Conchord.Stores.CardRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController
{
  private final CardRepository cardRepository;

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
