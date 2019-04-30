package com.xq.school.vo;

public class Management {
	private int mid;
	private String mkey;
	private String mname;
	private String msex;
	private String mphone;
	private String memail;
	private int midentity;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMkey() {
		return mkey;
	}
	public void setMkey(String mkey) {
		this.mkey = mkey;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMsex() {
		return msex;
	}
	public void setMsex(String msex) {
		this.msex = msex;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public int getMidentity() {
		return midentity;
	}
	public void setMidentity(int midentity) {
		this.midentity = midentity;
	}
	@Override
	public String toString() {
		return "Management [mid=" + mid + ", mkey=" + mkey + ", mname=" + mname + ", msex=" + msex + ", mphone="
				+ mphone + ", memail=" + memail + ", midentity=" + midentity + "]";
	}
	
	
}
