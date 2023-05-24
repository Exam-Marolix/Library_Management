package com.hrdcrlrner.library.api;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;


import com.hrdcrlrner.library.dto.BookDTO;
import com.hrdlrner.library.exception.LibraryManagementException;




public class BookAPI {

	public ResponseEntity<BookDTO> addBook(BookDTO dto) throws LibraryManagementException {

		return null;
	}

	public ResponseEntity<List<BookDTO>> findBooksByAuthorOrBookName(String bName, String authorName)
			throws LibraryManagementException {
		return null;
	}

	public ResponseEntity<?> findBooks(Integer pgNumber, Integer pgSize) throws LibraryManagementException {
		return null;
	}
}
