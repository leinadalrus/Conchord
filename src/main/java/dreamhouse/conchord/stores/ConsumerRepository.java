package dreamhouse.conchord.stores;

import dreamhouse.conchord.models.Consumer;
import org.springframework.data.repository.CrudRepository;

public interface ConsumerRepository extends CrudRepository<Consumer, Long>
{
  public String findByName(String name);
}
