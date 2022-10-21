package com.Tech.Demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Tech.Demo.Model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
	

}
