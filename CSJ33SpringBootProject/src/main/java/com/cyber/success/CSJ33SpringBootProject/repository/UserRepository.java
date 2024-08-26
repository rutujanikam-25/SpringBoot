package com.cyber.success.CSJ33SpringBootProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cyber.success.CSJ33SpringBootProject.model.User;

public interface UserRepository  extends JpaRepository<User,Long>{
	@Query("select u from User u where u.userName=:p1 and u.password=:p2")
	public User getLogin(@Param("p1")String un, @Param("p2")String password);

}
