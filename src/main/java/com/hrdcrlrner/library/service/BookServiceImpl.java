package com.hrdcrlrner.library.service;

import java.util.List;

import com.hrdcrlrner.library.dto.BookDTO;
import com.hrdlrner.library.exception.LibraryManagementException;

public class BookServiceImpl implements BookService {



	public BookDTO addBook(BookDTO bookDTO) throws LibraryManagementException {
		return null;
	}

	@Override
	public List<BookDTO> findBooksByAuthorOrBookName(String bname, String aname) throws LibraryManagementException {
		return null;
	}

	@Override
	public List<BookDTO> viewAllBooks(Integer pgNo, Integer noOfEntities) throws LibraryManagementException {
		return null;
	}
}
