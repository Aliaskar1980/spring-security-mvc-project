package com.peaksoft.service;

import com.peaksoft.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    void add(User user);

    List<User> getAllUser();

    User getById(Long id);

    void deleteById(Long id);

    void mergeUser(User user);

    User getUserByName(String name);




}
