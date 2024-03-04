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
	@RequestMapping(name = "/conchord-app")
	public Map<String, Object> index()
	{
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("content", "index.html");
		return model;
	}

	public static void main(String[] args)
	{
		SpringApplication.run(ConchordApplication.class, args);
	}
}
