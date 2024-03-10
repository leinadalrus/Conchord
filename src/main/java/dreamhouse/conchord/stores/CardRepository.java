package dreamhouse.conchord.stores;

import dreamhouse.conchord.models.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Long>
{}
