package web.dao;

import web.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class RoleDAOImp implements RoleDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Role getRoleByName(String name) {
        Role role = null;
        try {
            role = entityManager
                    .createQuery("SELECT role FROM Role role WHERE role.name=:name", Role.class)
                    .setParameter("name", name)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("Такой роли не существует");
        }
        return role;
    }

    @Override
    public Role show(int id) {
        return entityManager.find(Role.class, id);
    }

    @Override
    public List<Role> index() {
        return entityManager
                .createQuery("select role from Role role", Role.class)
                .getResultList();
    }

    @Override
    public Role getDefaultRole() {
        return getRoleByName("ROLE_USER");
    }
}
