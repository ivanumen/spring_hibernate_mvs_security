package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RoleController {
    @RequestMapping(value = "/")
    public String getHomePage(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC-SECURITY application");
        messages.add("This is Root Page");
        model.addAttribute("messages", messages);
        return "role/index";
    }

    @GetMapping(value = "login")
    public String getLoginPage() {
        return "role/login";
    }

    @GetMapping(value = "vip")
    public String getVipPage(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC-SECURITY application");
        messages.add("This is VIP Page");
        model.addAttribute("messages", messages);
        return "role/vip";
    }
}
