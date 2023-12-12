package ru.vadim.spring.SpringBoot.service;

import java.util.List;
import ru.vadim.spring.SpringBoot.model.User;

public interface UserService {

  List<User> getAllUsers();

  User showUserById(Long id);

  void saveUser(User user);

  void updateUser(Long id, User user);

  void deleteUser(Long id);

}
