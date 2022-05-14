package com.kbsuthar.beans;

import org.apache.xpath.operations.String;

public class BookBean {
private String callno,author,publisher;
private int quantity,issued;
public BookBean(java.lang.String callno2, java.lang.String name, java.lang.String author2, java.lang.String publisher2, int quantity2) {
	super();
	// TODO Auto-generated constructor stub
}
public BookBean(String callno, String name, String author, String publisher, int quantity) {
	super();
	this.callno = callno;
	this.name = name;
	this.author = author;
	this.publisher = publisher;
	this.quantity = quantity;
}
public BookBean() {
	// TODO Auto-generated constructor stub
}
public java.lang.String getCallno() {
	return callno;
}
public void setCallno(String callno) {
	this.callno = callno;
}
public java.lang.String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public java.lang.String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public java.lang.String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getIssued() {
	return issued;
}
public void setIssued(int issued) {
	this.issued = issued;
}
public void setCallno(java.lang.String string) {
	// TODO Auto-generated method stub
	
}
public void setName(java.lang.String string) {
	// TODO Auto-generated method stub
	
}
public void setPublisher(java.lang.String string) {
	// TODO Auto-generated method stub
	
}
public void setAuthor(java.lang.String string) {
	// TODO Auto-generated method stub
	
}

}
