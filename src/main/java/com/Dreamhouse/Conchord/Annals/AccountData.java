package com.Dreamhouse.Conchord.Annals;

import org.springframework.security.core.userdetails.User;

public record AccountData(UserDetail userDetail, User user)
{
}

