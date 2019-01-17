package com.stackroute.controller;

import com.stackroute.Domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String greeting(ModelMap map){
        return "index";
    }
    @RequestMapping("populate")
    public ModelAndView populate (@RequestParam("username") String name,@RequestParam("password") String password ){
        User user= new User();
        user.setPassword(password);
        user.setUsername(name);
        ModelAndView mv= new ModelAndView();
        mv.setViewName("show");
        mv.addObject("obj",user.getUsername());
        return mv;
    }
}
