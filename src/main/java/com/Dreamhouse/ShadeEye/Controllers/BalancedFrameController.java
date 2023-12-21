package com.Dreamhouse.ShadeEye.Controllers;

import com.Dreamhouse.ShadeEye.Exceptions.PosterNotFoundException;
import com.Dreamhouse.ShadeEye.Models.BalancedFrame;
import com.Dreamhouse.ShadeEye.Stores.BalancedFrameRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class BalancedFrameController
{
  private final BalancedFrameRepository balancedFrameRepository;

  public BalancedFrameController(
    BalancedFrameRepository balancedFrameRepository
  )
  {this.balancedFrameRepository = balancedFrameRepository;}

  @GetMapping("/user/pilot/{balancedFrame}")
  public ResponseEntity<BalancedFrame> getBalancedFrame(
    @RequestParam(name = "balancedFrame") BalancedFrame balancedFrame,
    Model model
  )
  {
    model.getAttribute("balancedFrame");
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);

    var balancedFrameResponseEntity = new ResponseEntity<>(new BalancedFrame(
      null), headers, HttpStatus.OK);

    try
    {
      return balancedFrameResponseEntity;
    }
    catch (PosterNotFoundException exception)
    {
      exception.getCause();
    } // finally...?

    return balancedFrameResponseEntity;
  }

  @DeleteMapping("/user/pilot/balanced-frame/{id}")
  public ResponseEntity<String> destroyPilot(@PathVariable Long id)
  {
    this.balancedFrameRepository.deleteById(id);
    return ResponseEntity.noContent().build();
  }
}
