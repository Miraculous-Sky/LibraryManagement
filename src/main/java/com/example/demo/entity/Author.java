package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "Author")

public class Author {
	@Id
	@Column(name = "AuthorID")
	private String authorID;
	@Column(name = "AuthorName")
	private String authorName;
	@Column(name = "PenName")
	private String penName;

	

	public String getAuthorID() {
		return authorID;
	}

	public void setAuthorID(String authorID) {
		this.authorID = authorID;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPenName() {
		return penName;
	}

	public void setPenName(String penName) {
		this.penName = penName;
	}

}
