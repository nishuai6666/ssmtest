package com.javan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.javan.dao.IUserDao;
import com.javan.dto.User;
import com.javan.service.IUserService;

@Service("userService") 
public class UserServiceImpl implements IUserService {

	 @Resource  
	 private IUserDao userDao; 
	 
	@Override
	 public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
	
	 
	    
	   

}
