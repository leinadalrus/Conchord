package dreamhouse.conchord.services;

import dreamhouse.conchord.models.Consumer;
import dreamhouse.conchord.stores.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner
{
  private final ConsumerRepository consumerRepository;

  @Autowired
  public DatabaseLoader(ConsumerRepository repository)
  {
    this.consumerRepository = repository;
  }

  @Override
  public void run(String... strings) throws Exception
  {
    this.consumerRepository.save(new Consumer("john-doe@dmail.com"));
  }
}
