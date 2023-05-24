package com.hrdlrner.library.util;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hrdlrner.library.exception.LibraryManagementException;


public class GlobalExceptionHandler {

	public ResponseEntity<ErrorInfo> userDefinedException(Exception e) {
	

		ErrorInfo err = new ErrorInfo();
		err.setErrorCode(HttpStatus.BAD_REQUEST.value());
		err.setErrorTime(LocalDateTime.now());
		err.setErrorMessage(e.getMessage());
		return new ResponseEntity<ErrorInfo>(err, HttpStatus.BAD_REQUEST);
	}
	public ResponseEntity<ErrorInfo> methodArugumentExceptionHandling(Exception e) {

	
		ErrorInfo err = new ErrorInfo();
		err.setErrorCode(HttpStatus.BAD_REQUEST.value());
		err.setErrorTime(LocalDateTime.now());

		MethodArgumentNotValidException manve = (MethodArgumentNotValidException) e;

		List<ObjectError> ol = manve.getAllErrors();
		String errMsgs = ol.stream().map(t -> t.getDefaultMessage()).collect(Collectors.joining(", "));
		err.setErrorMessage(errMsgs);

		// err.setErrorMessage(
		// manve.getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.joining(",
		// ")));
		return new ResponseEntity<ErrorInfo>(err, HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<ErrorInfo> exceptionHandling(Exception e) {
		ErrorInfo err = new ErrorInfo();
		err.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		err.setErrorTime(LocalDateTime.now());
		err.setErrorMessage(e.toString());
		return new ResponseEntity<ErrorInfo>(err, HttpStatus.INTERNAL_SERVER_ERROR);

	}

}
