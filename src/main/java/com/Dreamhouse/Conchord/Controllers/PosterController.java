package com.Dreamhouse.Conchord.Controllers;

import com.Dreamhouse.Conchord.Models.Poster;
import com.Dreamhouse.Conchord.Exceptions.PosterNotFoundException;
import com.Dreamhouse.Conchord.Stores.PosterRepository;
import org.springframework.http.*;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PosterController
{
  private PosterRepository posterRepository;

  @GetMapping("/poster/{id}")
  public String Poster(@PathVariable("id") String id)
  {
    return id;
  }
  // Database manipulation:

  public PosterController(PosterRepository repository)
  {
    this.posterRepository = repository;
  }

  @CrossOrigin(origins = "http://localhost:3000")
  @GetMapping("/poster/{id}")
  public HttpEntity<Poster> requestImageURI(
    @RequestParam(name = "mediaImageURI", required = true, defaultValue = "poster") String mediaImageURI,
    Model model
  )
  {
    model.addAttribute("mediaImageURI", mediaImageURI);
    Poster _poster = new Poster("Nib", "Crash", "Pulmonary", "2023-10-11");

    return new ResponseEntity<>(_poster, HttpStatus.OK);
  }

  @CrossOrigin(origins = "http://localhost:3000")
  @PostMapping("/poster/{ids}")
  public ResponseEntity<Poster> updatePostersCollection(@PathVariable int ids)
  {
    Poster posterComparator = new Poster("Nib",
                                         "Crash",
                                         "Pulmonary",
                                         "2023-10-11"
    );
    List<Poster> posters = new ArrayList<>();
    posters.add(posterComparator);
    Poster poster = null;

    for (Poster p : posters)
    {
      try
      {
        if (p.getId() >= 0L) poster = p;
      }
      catch (PosterNotFoundException exception)
      {
        exception.getCause();
      } // finally...?
    }

    return new ResponseEntity<>(poster, HttpStatus.OK);
  }

  @CrossOrigin(origins = "http://localhost:3000")
  @PutMapping("/poster")
  public ResponseEntity<String> createPoster(@PathVariable String id)
  {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);

    return new ResponseEntity<>(id, headers, HttpStatus.OK);
  }

  @DeleteMapping("/poster/{id}")
  public ResponseEntity<String> destroyPoster(@PathVariable Long id)
  {
    this.posterRepository.deleteById(id);
    return ResponseEntity.noContent().build();
  }
}
