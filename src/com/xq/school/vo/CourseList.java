package com.xq.school.vo;

public class CourseList {
	private String stuid;
	private String cid;
	private String cname;
	private String times;
	private String teaname;
	private int couscore;
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
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
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
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
	@Override
	public String toString() {
		return "CourseList [stuid=" + stuid + ", cid=" + cid + ", cname=" + cname + ", times=" + times + ", teaname="
				+ teaname + ", couscore=" + couscore + "]";
	}
}
