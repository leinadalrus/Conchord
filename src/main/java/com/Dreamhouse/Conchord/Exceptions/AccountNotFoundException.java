package com.Dreamhouse.Conchord.Exceptions;

public class AccountNotFoundException extends RuntimeException
{
  AccountNotFoundException(Long id)
  {
    super("Could not find given ID for the account:\t" + id);
  }
}