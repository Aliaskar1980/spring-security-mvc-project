package com.peaksoft.dao;

import com.peaksoft.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {


    List<User> getAllUser();

    User getById(Long id);

    void deleteUserById(Long id);

    void mergeUser(User user);

    User getUserByName(String name);

    void add(User user);






}
