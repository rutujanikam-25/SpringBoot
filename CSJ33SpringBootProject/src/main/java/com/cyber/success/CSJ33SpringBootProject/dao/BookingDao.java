package com.cyber.success.CSJ33SpringBootProject.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyber.success.CSJ33SpringBootProject.model.Book;
import com.cyber.success.CSJ33SpringBootProject.repository.BookingRepository;

@Service
public class BookingDao {
  
	 @Autowired
	 private BookingRepository repos;
	 
	
	public Book addBook(Book book) {
		return repos.save(book);
	}
}
