package com.training.ifaces;

import java.util.List;

import com.training.services.Book;

public class BookServices implements CrudRepository<Book> {

	@Override
	public boolean save(Book entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
