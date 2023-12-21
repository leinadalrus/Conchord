package com.Dreamhouse.ShadeEye.Exceptions;

public class AccountNotFoundException extends RuntimeException
{
  AccountNotFoundException(Long id)
  {
    super("Could not find given ID for the account:\t" + id);
  }
}
