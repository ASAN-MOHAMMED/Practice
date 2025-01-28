package com.nasa.bookapp;

import java.util.List;

import org.springframework.stereotype.Service;
import com.nasa.training.Employee;

@Service
public class BookServiceImpl implements IBookService{

	public List<String> getAll() {

		return List.of("Java","Spring","MicroServices");
	}

}
