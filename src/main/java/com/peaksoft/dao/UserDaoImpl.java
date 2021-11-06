package com.peaksoft.dao;

import com.peaksoft.model.Role;
import com.peaksoft.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {
//
////    private final Map<String, User> userMap =  Collections.singletonMap("test",
////            new User(1L, "test", "test", Collections.singleton(new Role(1L, "ROLE_USER")))); // name - уникальное значение, выступает в качестве ключа Map
//
//    @Override
//    public User getUserByName(String name) {
//        if (!userMap.containsKey(name)) {
//            return null;
//        }
//
//        return userMap.get(name);
//    }



    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> getAllUser() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User getById(Long id) {
        return (User) entityManager.find(User.class, id);
    }

    @Override
    public void deleteUserById(Long id) {
        entityManager.remove(getById(id));
    }

    @Override
    public void mergeUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getUserByName(String name) {
        List<User> users = getAllUser();

        return users.stream().filter(x->x.getUsername().equals(name)).findAny().orElse(new User());
    }
}


