package com.xq.school.vo;

import java.util.List;

public class Student {
	private int sid;
	private String skey;
	private String sname;
	private String ssex;
	private int sage;
	private int scredit;
	private String saddress;
	private String sphone;
	private String semail;
	private String sdepartment;
	private int sdepartnum;
	private int sidentity;
	private Elect elect;
	private List<Course> course;
	private CourseList courselist;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSkey() {
		return skey;
	}
	public void setSkey(String skey) {
		this.skey = skey;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public int getScredit() {
		return scredit;
	}
	public void setScredit(int scredit) {
		this.scredit = scredit;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSdepartment() {
		return sdepartment;
	}
	public void setSdepartment(String sdepartment) {
		this.sdepartment = sdepartment;
	}
	public int getSdepartnum() {
		return sdepartnum;
	}
	public void setSdepartnum(int sdepartnum) {
		this.sdepartnum = sdepartnum;
	}
	public int getSidentity() {
		return sidentity;
	}
	public void setSidentity(int sidentity) {
		this.sidentity = sidentity;
	}
	public Elect getElect() {
		return elect;
	}
	public void setElect(Elect elect) {
		this.elect = elect;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public CourseList getCourselist() {
		return courselist;
	}
	public void setCourselist(CourseList courselist) {
		this.courselist = courselist;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", skey=" + skey + ", sname=" + sname + ", ssex=" + ssex + ", sage=" + sage
				+ ", scredit=" + scredit + ", saddress=" + saddress + ", sphone=" + sphone + ", semail=" + semail
				+ ", sdepartment=" + sdepartment + ", sdepartnum=" + sdepartnum + ", sidentity=" + sidentity
				+ ", elect=" + elect + ", course=" + course + ", courselist=" + courselist + "]";
	}
	
}
