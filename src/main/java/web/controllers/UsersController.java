package web.controllers;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.User;
import web.service.UserService;
import web.service.UserServiceImpl;

@Controller
public class UsersController {
    @Autowired
    UserService userService;


    @GetMapping("/")
    public String index(Model model) {

        User user =new User("someone");
    model.addAttribute("user1",user);
        return "users/index";
    }

}
