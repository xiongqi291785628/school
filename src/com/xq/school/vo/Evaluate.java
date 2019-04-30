package com.xq.school.vo;

public class Evaluate {
	
	private String stu_id;
	private String cour_id;
	private String tea_name;
	private int tea_score;
	private String note;
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getCour_id() {
		return cour_id;
	}
	public void setCour_id(String cour_id) {
		this.cour_id = cour_id;
	}
	public String getTea_name() {
		return tea_name;
	}
	public void setTea_name(String tea_name) {
		this.tea_name = tea_name;
	}
	public int getTea_score() {
		return tea_score;
	}
	public void setTea_score(int tea_score) {
		this.tea_score = tea_score;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Evaluate [stu_id=" + stu_id + ", cour_id=" + cour_id + ", tea_name=" + tea_name + ", tea_score="
				+ tea_score + ", note=" + note + "]";
	}
}
