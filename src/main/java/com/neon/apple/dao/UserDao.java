package com.neon.apple.dao; 
import org.springframework.data.jpa.repository.JpaRepository;

import com.neon.apple.pojo.User;

import javax.transaction.Transactional;   
import java.util.List;  
  
public interface UserDao extends JpaRepository<User, Integer> { 
	  List<User> findByName(String name);  
//    public List<User> findBySex(char sex);  
//    public List<User> findByBirthday(Date birthday);  
//    public List<User> findBySendtime(Date sendtime);  
//    public List<User> findByPrice(BigDecimal price);  
//    public List<User> findByFloatprice(float floatprice);  
//    public List<User> findByDoubleprice(double doubleprice);  
}  
