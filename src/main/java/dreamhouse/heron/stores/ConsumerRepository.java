package dreamhouse.heron.stores;

import dreamhouse.heron.models.Consumer;
import org.springframework.data.repository.CrudRepository;

public interface ConsumerRepository extends CrudRepository<Consumer, Long>
{
  public String findByName(String name);
}
