package com.neuedu.web;

import com.neuedu.pojo.User;
import com.neuedu.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WebTest {

    @Autowired
    private IuserService service;
  @RequestMapping("/test.do")
  public String test(ModelMap map){
     List<User> list= service.Listss();
     map.addAttribute("list",list);
     return "test";
  }
}
