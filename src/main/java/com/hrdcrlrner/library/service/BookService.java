package com.hrdcrlrner.library.service;

import java.util.List;

import com.hrdcrlrner.library.dto.BookDTO;
import com.hrdlrner.library.exception.LibraryManagementException;

public interface BookService {
	BookDTO addBook(BookDTO bookDTO) throws LibraryManagementException;

	List<BookDTO> findBooksByAuthorOrBookName(String bname,String aname) throws LibraryManagementException;
	
	List<BookDTO> viewAllBooks(Integer pgNo,Integer noOfEntities) throws LibraryManagementException;
}
