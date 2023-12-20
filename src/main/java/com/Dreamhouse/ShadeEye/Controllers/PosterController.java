package com.Dreamhouse.ShadeEye.Controllers;

import com.Dreamhouse.ShadeEye.Models.Flair;
import com.Dreamhouse.ShadeEye.Models.Poster;
import com.Dreamhouse.ShadeEye.Shared.PosterRepository;
import org.springframework.http.*;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PosterController
{
  @GetMapping("/poster/{id}")
  public String Poster(@PathVariable("id") String id)
  {
    return id;
  }

  // Database manipulation:
  PosterRepository posterRepository;

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
    posterRepository.deleteById(id);
    return ResponseEntity.noContent().build();
  }
}
