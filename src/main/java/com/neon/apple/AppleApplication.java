package com.neon.apple; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neon.apple.dao.UserDao;
import com.neon.apple.pojo.User;

@SpringBootApplication
public class AppleApplication{
  @RequestMapping("/")
     String home() {
         return "index";
     }
  
  @Autowired 
  private UserDao userDao;  
  
  @RequestMapping("/getName")  
  public String getByName() {  
      List<User> userList = userDao.findByName("jiajia");  
      if (userList != null && userList.size()!=0) {  
          return "The user length is: " + userList.size();  
      }  
      return "user " + "jiajia" + " is not exist.";  
  }  
  
  
     public static void main(String[] args) {
         SpringApplication.run(AppleApplication.class, args);
     }
}
