package com.example.demo.entity;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Publisher")
public class Publisher {
	@Id
	private String publisherID;
	private String publisherName;
	private String address;
	private String phoneNumber;
	private String eMail;
	private String website;

	public String getPublisherID() {
		return publisherID;
	}

	public void setPublisherID(String publisherID) {
		this.publisherID = publisherID;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "Publisher [publisherID=" + publisherID + ", publisherName=" + publisherName + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", eMail=" + eMail + ", website=" + website + "]";
	}

}
