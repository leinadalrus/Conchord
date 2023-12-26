package com.Dreamhouse.Conchord.Controllers;

import com.Dreamhouse.Conchord.Exceptions.AccountNotFoundException;
import com.Dreamhouse.Conchord.Models.Account;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController
{
  @GetMapping("/{user}")
  public String getUsername(
    @RequestParam(name = "email", required = true) Account user
  )
  {
    try
    {
      return user.getUsername();
    }
    catch (AccountNotFoundException exception)
    {
      exception.getCause();
    } // finally...?

    return user.getUsername();
  }

  public String getPassword(
    @RequestParam(name = "password", required = true) Account user
  )
  {
    try
    {
      return user.getPassword();
    }
    catch (AccountNotFoundException exception)
    {
      exception.getCause();
    } // finally...?

    return user.getPassword();
  }

  @PostMapping("/login")
  public ResponseEntity<Account> updateLoginCredentials(
    @RequestParam(name = "login", required = true) Account user, Model model
  )
  {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);

    var account = new ResponseEntity<>(
      new Account(this.getUsername(user), this.getPassword(user)),
      headers,
      HttpStatus.OK
    );

    try
    {
      return account;
    }
    catch (AccountNotFoundException exception)
    {
      exception.getCause();
    } // finally...?

    return account;
  }
}
