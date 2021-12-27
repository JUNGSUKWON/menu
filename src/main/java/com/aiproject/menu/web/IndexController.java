package com.aiproject.menu.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

   @GetMapping("/")
   public String index() {
       return "index";
   }

   @GetMapping("/hello")
   public String hello() {
       return "hello";
   }

   @GetMapping("/input")
   public String input() {
       return "input";
   }

   @GetMapping("/menu")
    public String menu(Model model){
        model.addAttribute("menuname", "고기");
        return "menu";
    }
}
