package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;
import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    private UserDAO dao;

    @Autowired
    public void setDao(UserDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<User> index() {
        return dao.index();
    }

    @Override
    public void save(User user) {
        dao.save(user);
    }

    @Override
    public User show(int id) {
        return dao.show(id);
    }

    @Override
    public void update(User updatedUser) {
        dao.update(updatedUser);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return dao.getUserByUsername(userName);
    }
}
