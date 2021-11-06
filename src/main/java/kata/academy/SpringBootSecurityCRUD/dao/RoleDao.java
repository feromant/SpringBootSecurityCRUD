package kata.academy.SpringBootSecurityCRUD.dao;

import kata.academy.SpringBootSecurityCRUD.model.Role;

import java.util.List;

public interface RoleDao {

    void saveRole(Role role);

    List<Role> getAllRoles();

    Role getRoleByType(String type);

    Role getRoleById(Long id);
}
