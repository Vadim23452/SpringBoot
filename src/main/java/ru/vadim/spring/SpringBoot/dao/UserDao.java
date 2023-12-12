package ru.vadim.spring.SpringBoot.dao;

import java.util.List;
import ru.vadim.spring.SpringBoot.model.User;

public interface UserDao {

   List<User> getAllUsers();

   User showUserById(Long id);

   void saveUser(User user);

   void updateUser(Long id, User user);

   void deleteUser(Long id);

}
