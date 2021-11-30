package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> index();

    void save(User user);

    User show(int id);

    void update(User updatedUser);

    void delete(int id);

    User getUserByUsername(String userName);
}
