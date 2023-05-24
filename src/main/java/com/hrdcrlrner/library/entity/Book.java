package com.hrdcrlrner.library.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


public class Book {

	private Integer bookId;

	private String bookName;

	private LocalDate publishedYear;
	
	private String publisher;

	
	private Author author;

	
}
