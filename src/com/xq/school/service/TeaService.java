package com.xq.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xq.school.dao.ManaMapper;
import com.xq.school.dao.TeaMapper;
import com.xq.school.vo.Course;
import com.xq.school.vo.Elect;
import com.xq.school.vo.Evaluate;
import com.xq.school.vo.Teacher;

@Service
public class TeaService {
	
	@Autowired
	private TeaMapper teaMapper;
	@Autowired
	private ManaMapper manaMapper;
	//修改老师密码
	public void updatePassById(Teacher tea) {
		teaMapper.updatePassById(tea);
	}
	
	//查看个人老师的课程
	public List<Course> findOneTeacherCourse(String teaname){
		return teaMapper.findOneTeacherCourse(teaname);
	}
	
	//由课程ID进入打分页面
	public List<Course> findStuScore(String cid){
		return teaMapper.findStuScore(cid);
	}
	
	//添加学生分数
	public void insertStuScore(Elect ele) {
		teaMapper.insertStuScore(ele);
	}
	
	//修改学生分数
	//public void updateStuScore(Elect elect) {
	//	teaMapper.updateStuScore(elect);
	//}
	
	//查看学生给老师留言
	public List<Evaluate> findStudentNote(String teaname){
		return teaMapper.findStudentNote(teaname);
	}
	
	//查看学生成绩
	public List<Elect> lookStuScore(String cid){
		return manaMapper.lookStuScore(cid);
	}
}
