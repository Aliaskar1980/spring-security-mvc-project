package com.peaksoft.dao;

import com.peaksoft.model.Role;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Role> getAllRoles() {
        return entityManager.createQuery("select r from Role r", Role.class).getResultList();
    }

    @Override
    @Transactional
    public List<String> getNamesOfRolesToList() {
        return entityManager.createQuery("select role from Role").getResultList();
    }

    @Override
    public Role getRoleByName(String name) {
        Query query = entityManager.createQuery("select role from Role role where role.role=:role");
        query.setParameter("role",name);

        return (Role) query.getSingleResult();
    }


//    private SessionFactory sessionFactory;
//
//    public RoleDaoImpl(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    @Override
//    public List<Role> getAllRoles() {
//        return sessionFactory.getCurrentSession().createQuery("from Role").getResultList();
//    }
//
//    @Override
//    public List<String> getNamesOfRoles() {
//        return sessionFactory.getCurrentSession().createQuery("select role from Role").getResultList();
//    }
//
//    @Override
//    public Role getRoleByName(String name) {
//        Query query = sessionFactory.getCurrentSession().createQuery("select role from Role role where role.role =: role");
//        query.setParameter("role", name);
//        return (Role) query.getSingleResult();
//    }
}
