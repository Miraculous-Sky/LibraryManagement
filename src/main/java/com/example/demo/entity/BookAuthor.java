package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book_Author")
public class BookAuthor {
	@Id
	@Column(name = "BookAuthorID")
	private String bookAuthorID;
	@Column(name = "AuthorID")
	private String authorID;
	@Column(name = "BookID")
	private String bookID;

	

	public String getBookAuthorID() {
		return bookAuthorID;
	}

	public void setBookAuthorID(String bookAuthorID) {
		this.bookAuthorID = bookAuthorID;
	}

	public String getAuthorID() {
		return authorID;
	}

	public void setAuthorID(String authorID) {
		this.authorID = authorID;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

}
