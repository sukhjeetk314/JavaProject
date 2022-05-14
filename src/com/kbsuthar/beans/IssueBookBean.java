package com.kbsuthar.beans;

import java.sql.Date;

import org.apache.xpath.operations.String;

public class IssueBookBean {
private String callno,studentid,studentname;
private long studentmobile;
private Date issueddate;
private String returnstatus;

public IssueBookBean(java.lang.String callno2, java.lang.String studentid2, java.lang.String studentname2, long studentmobile2) {}
public IssueBookBean(String callno, String studentid, String studentname, long studentmobile) {
	super();
	this.callno = callno;
	this.studentid = studentid;
	this.studentname = studentname;
	this.studentmobile = studentmobile;
}

public String getReturnstatus() {
	return returnstatus;
}
public void setReturnstatus(String returnstatus) {
	this.returnstatus = returnstatus;
}
public Date getIssueddate() {
	return issueddate;
}
public void setIssueddate(Date issueddate) {
	this.issueddate = issueddate;
}
public java.lang.String getCallno() {
	return callno;
}
public void setCallno(String callno) {
	this.callno = callno;
}
public java.lang.String getStudentid() {
	return studentid;
}
public void setStudentid(String studentid) {
	this.studentid = studentid;
}
public java.lang.String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public long getStudentmobile() {
	return studentmobile;
}
public void setStudentmobile(long studentmobile) {
	this.studentmobile = studentmobile;
}

}
