package web.dao;

import web.model.Role;

import java.util.List;

public interface RoleDAO {
    Role getRoleByName(String name);

    Role show(int id);

    List<Role> index();

    Role getDefaultRole();
}
