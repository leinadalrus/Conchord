package com.Dreamhouse.ShadeEye.Controllers;

import com.Dreamhouse.ShadeEye.Annals.AccountData;
import com.Dreamhouse.ShadeEye.Annals.LoginDetail;
import com.Dreamhouse.ShadeEye.Annals.UserDetail;
import com.Dreamhouse.ShadeEye.Exceptions.AccountNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController
{
  private final AccountData accountData;

  LoginController(AccountData accountData, UserDetail userDetail, User user)
  {
    this.accountData = accountData;
  }

  @GetMapping("/login")
  public LoginDetail getLogin(
    @RequestParam(name = "login", required = true) User user
  )
  {
    try
    {
      return new LoginDetail(this.accountData);
    }
    catch (AccountNotFoundException exception)
    {
      exception.getCause();
    } // finally...?

    return new LoginDetail(this.accountData);
  }

  @PostMapping("/login")
  public ResponseEntity<LoginDetail> updateLoginCredentials(
    @RequestParam(name = "login", required = true) User user, Model model
  )
  {
    model.getAttribute("username");
    model.getAttribute("password");

    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);

    var account = new ResponseEntity<>(new LoginDetail(this.accountData),
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
