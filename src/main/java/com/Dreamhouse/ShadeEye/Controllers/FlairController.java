package com.Dreamhouse.ShadeEye.Controllers;

import com.Dreamhouse.ShadeEye.Data.Avatar;
import com.Dreamhouse.ShadeEye.Data.Emblem;

import com.Dreamhouse.ShadeEye.Models.Flair;
import com.fs.starfarer.combat.R;
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
public class FlairController
{
  private Avatar avatar;
  private Emblem emblem;

  private static final String _template = "";

  @CrossOrigin(origins = "http://localhost:3000")
  @GetMapping("/{flair}")
  public HttpEntity<Flair> flair(
    @RequestParam(name = "imageMediaURI", required = true, defaultValue = "flair") String flair,
    Model model
  )
  {
    model.addAttribute("imageMediaURI", flair);
    Flair _flair = new Flair(flair);

    return new ResponseEntity<>(_flair, HttpStatus.OK);
  }

  @PutMapping("/{flair}")
  public ResponseEntity<String> retrieveFlair(@PathVariable String flair)
  {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);

    return new ResponseEntity<>(flair, headers, HttpStatus.OK);
  }

  @DeleteMapping("/flair/{id}")
  public ResponseEntity<String> destroyFlair(@PathVariable String id)
  {
    return ResponseEntity.noContent().build();
  }
}
