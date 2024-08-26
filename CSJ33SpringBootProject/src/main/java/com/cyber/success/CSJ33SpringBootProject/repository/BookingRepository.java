package com.cyber.success.CSJ33SpringBootProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyber.success.CSJ33SpringBootProject.model.Book;

public interface BookingRepository extends JpaRepository<Book,Long>{

}
