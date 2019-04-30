package com.xq.school.vo;

public class Elect {
	private String course_id;
	private String stu_id;
	private int score;
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Elect [course_id=" + course_id + ", stu_id=" + stu_id + ", score=" + score + "]";
	}
}
