package com.peaksoft.service;

import com.peaksoft.dao.UserDao;
import com.peaksoft.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        userDao.deleteUserById(id);
    }

    @Override
    public void mergeUser(User user) {
        userDao.mergeUser(user);
    }

    @Override
    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }


}
