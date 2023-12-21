package com.Dreamhouse.ShadeEye.Controllers;

import com.Dreamhouse.ShadeEye.Annals.LoginDetail;
import com.Dreamhouse.ShadeEye.Annals.PilotData;
import com.Dreamhouse.ShadeEye.Exceptions.AccountNotFoundException;
import com.Dreamhouse.ShadeEye.Stores.PilotRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class PilotController
{
  private final PilotRepository pilotRepository;

  public PilotController(
    PilotRepository pilotRepository
  )
  {this.pilotRepository = pilotRepository;}

  @GetMapping("/user/{pilot}")
  public ResponseEntity<PilotData> getPilot(
    @RequestParam(name = "pilot") PilotData pilot, Model model
  )
  {
    model.getAttribute("pilot");
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);

    var pilotDataResponseEntity = new ResponseEntity<>(new PilotData("Interpellates",
                                                                     "Elite",
                                                                     "Perambulator",
                                                                     "Dissimilar",
                                                                     0L
    ),
                                                       headers,
                                                       HttpStatus.OK
    );

    try
    {
      return pilotDataResponseEntity;
    }
    catch (AccountNotFoundException exception)
    {
      exception.getCause();
    } // finally...?

    return pilotDataResponseEntity;
  }

  @PutMapping("/user/{pilot}")
  public ResponseEntity<PilotData> editPilotCharacter(
    @RequestParam(name = "pilot") PilotData pilot, Model model
  )
  {
    model.addAttribute("pilot", pilot);
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);

    var pilotDataResponseEntity = new ResponseEntity<>(new PilotData("Interpellates",
                                                                     "Elite",
                                                                     "Perambulator",
                                                                     "Dissimilar",
                                                                     0L
    ),
                                                       headers,
                                                       HttpStatus.OK
    );

    try
    {
      return pilotDataResponseEntity;
    }
    catch (AccountNotFoundException exception)
    {
      exception.getCause();
    } // finally...?

    return pilotDataResponseEntity;
  }

  @PostMapping("/user/{pilot}")
  public ResponseEntity<PilotData> updatePilots(
    @RequestParam(name = "pilot") PilotData pilot, Model model
  )
  {
    model.addAttribute("pilot", pilot);
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);

    var pilotDataResponseEntity = new ResponseEntity<>(new PilotData("Interpellates",
                                                                     "Elite",
                                                                     "Perambulator",
                                                                     "Dissimilar",
                                                                     0L
    ),
                                                       headers,
                                                       HttpStatus.OK
    );

    try
    {
      return pilotDataResponseEntity;
    }
    catch (AccountNotFoundException exception)
    {
      exception.getCause();
    } // finally...?

    return pilotDataResponseEntity;
  }

  @DeleteMapping("/user/pilot/{id}")
  public ResponseEntity<String> destroyPilot(@PathVariable Long id)
  {
    this.pilotRepository.deleteById(id);
    return ResponseEntity.noContent().build();
  }
}
