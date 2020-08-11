package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Borrow_Book")
public class BorrowBook {
@Id
@Column(name = "BorrowID")
	private String borrowID;
	private Date borrowDate;
	private Date returnDate;
	private String bookID;
	private String personID;

	public String getBorrowID() {
		return borrowID;
	}

	public void setBorrowID(String borrowID) {
		this.borrowID = borrowID;
	}

	public Date getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getPersonID() {
		return personID;
	}

	public void setPersonID(String personID) {
		this.personID = personID;
	}

	@Override
	public String toString() {
		return "BorrowBook [borrowID=" + borrowID + ", borrowDate=" + borrowDate + ", returnDate=" + returnDate
				+ ", bookID=" + bookID + ", personID=" + personID + "]";
	}
}
