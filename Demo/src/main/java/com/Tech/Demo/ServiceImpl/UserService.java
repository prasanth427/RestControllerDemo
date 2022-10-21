package com.Tech.Demo.ServiceImpl;

import java.util.List;



import com.Tech.Demo.Model.User;



public interface UserService {
     List<User> findAll();
     User findbyid(int empid);
     User SaveUser(User user);
     void Deletebyid(int empid);
}


