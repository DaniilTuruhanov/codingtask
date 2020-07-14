package concerttours.controller;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUserPage(Model model) {
        UserModel user = userService.getCurrentUser();
        model.addAttribute("user",user);
        return "user";
    }
}