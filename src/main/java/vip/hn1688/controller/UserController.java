package vip.hn1688.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vip.hn1688.entity.User;
import vip.hn1688.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
    private UserService userService;
	static {
		System.out.println("UserController创建了");
	}
    @RequestMapping("/showuser")
    public String toIndex(HttpServletRequest request,Model model){
    	System.out.println("进来了");
        String userId = request.getParameter("id");
        User user = this.userService.getUserById(userId);
        System.out.println(user.getUserName());
        model.addAttribute("user", user);
        return "showUser";
    }
    
}
