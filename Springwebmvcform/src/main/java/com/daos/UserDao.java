package com.daos;

import com.mymodels.Login;
import com.mymodels.User;

public interface UserDao {
  void register(User user);
  User validateUser(Login login);
}