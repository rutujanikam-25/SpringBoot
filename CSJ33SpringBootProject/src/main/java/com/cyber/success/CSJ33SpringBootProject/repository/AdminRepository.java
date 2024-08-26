package com.cyber.success.CSJ33SpringBootProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyber.success.CSJ33SpringBootProject.model.Admin;
@Repository
public interface AdminRepository  extends JpaRepository<Admin,Long>{

}
