package com.xq.school.vo;

import java.util.List;

public class Course {
	private String cid;
	private String cname;
	private String ctype;
	private float cscore;
	private int cmax;
	private int cnumber;
	private String times;
	private String department;
	private String teaname;
	private int couscore;
	private String stuid;
	private int teaid;
	private List<Student> student;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public float getCscore() {
		return cscore;
	}
	public void setCscore(float cscore) {
		this.cscore = cscore;
	}
	public int getCmax() {
		return cmax;
	}
	public void setCmax(int cmax) {
		this.cmax = cmax;
	}
	public int getCnumber() {
		return cnumber;
	}
	public void setCnumber(int cnumber) {
		this.cnumber = cnumber;
	}
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTeaname() {
		return teaname;
	}
	public void setTeaname(String teaname) {
		this.teaname = teaname;
	}
	public int getCouscore() {
		return couscore;
	}
	public void setCouscore(int couscore) {
		this.couscore = couscore;
	}
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public int getTeaid() {
		return teaid;
	}
	public void setTeaid(int teaid) {
		this.teaid = teaid;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", ctype=" + ctype + ", cscore=" + cscore + ", cmax=" + cmax
				+ ", cnumber=" + cnumber + ", times=" + times + ", department=" + department + ", teaname=" + teaname
				+ ", couscore=" + couscore + ", stuid=" + stuid + ", teaid=" + teaid + ", student=" + student + "]";
	}
	
}
