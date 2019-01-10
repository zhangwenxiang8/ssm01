package com.neuedu.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.User;
import com.neuedu.service.IuserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class WebTest {



    @Autowired
    private IuserService service;
  @RequestMapping("/list.do")
  public String test(ModelMap map){

      int pageNum=1;
      int pageSize=3;
      PageHelper.startPage(pageNum,pageSize);

     List<User> list= service.Lists();
      PageInfo<User> page=new PageInfo<>(list);
     map.addAttribute("list",list);
      map.addAttribute("page",page);
     return "list";
  }



  }

