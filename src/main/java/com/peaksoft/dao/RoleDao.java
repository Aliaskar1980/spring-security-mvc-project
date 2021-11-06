package com.peaksoft.dao;

import com.peaksoft.model.Role;

import java.util.List;

public interface RoleDao {
    List<Role> getAllRoles();
    List<String> getNamesOfRolesToList();
    Role getRoleByName(String name);
}
