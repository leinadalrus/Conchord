package dreamhouse.conchord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@SpringBootApplication
public class ConchordApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ConchordApplication.class, args);
	}
}
