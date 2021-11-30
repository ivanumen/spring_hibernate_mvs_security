package web.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.AppConfig;
import web.model.Role;
import web.model.User;
import web.service.UserService;

import java.util.Set;

public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService service = context.getBean(UserService.class);
        service.save(new User("Ivan", "test", "ivan@mail.ru", (Set<Role>) new Role(1, "ROLE_VIP")));
        context.close();
    }
}
