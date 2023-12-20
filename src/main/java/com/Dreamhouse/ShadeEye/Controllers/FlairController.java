package com.Dreamhouse.ShadeEye.Controllers;

import com.Dreamhouse.ShadeEye.Data.Avatar;
import com.Dreamhouse.ShadeEye.Data.Emblem;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

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
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/user");
public class FlairController
{
  private Avatar avatar;
  private Emblem emblem;

  @GetMapping("/{flair}")
  public String Flair(@RequestParam("flair") String flair)
  {
    return flair;
  }

  @PutMapping("/{flair}")
  public ResponseEntity<String> fetchFlair(@PathVariable String flair)
  {
    String messageSlices = flair;
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);

    return new ResponseEntity<>(messageSlices, headers, HttpStatus.OK);
  }
}
