package com.cyber.success.CSJ33SpringBootProject.repository;

import org.springframework.data.repository.CrudRepository;

import com.cyber.success.CSJ33SpringBootProject.model.Course;

public interface StudentRepository extends CrudRepository<Course,Long>{
}
