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
	//�޸���ʦ����
	public void updatePassById(Teacher tea) {
		teaMapper.updatePassById(tea);
	}
	
	//�鿴������ʦ�Ŀγ�
	public List<Course> findOneTeacherCourse(String teaname){
		return teaMapper.findOneTeacherCourse(teaname);
	}
	
	//�ɿγ�ID������ҳ��
	public List<Course> findStuScore(String cid){
		return teaMapper.findStuScore(cid);
	}
	
	//���ѧ������
	public void insertStuScore(Elect ele) {
		teaMapper.insertStuScore(ele);
	}
	
	//�޸�ѧ������
	//public void updateStuScore(Elect elect) {
	//	teaMapper.updateStuScore(elect);
	//}
	
	//�鿴ѧ������ʦ����
	public List<Evaluate> findStudentNote(String teaname){
		return teaMapper.findStudentNote(teaname);
	}
	
	//�鿴ѧ���ɼ�
	public List<Elect> lookStuScore(String cid){
		return manaMapper.lookStuScore(cid);
	}
}
