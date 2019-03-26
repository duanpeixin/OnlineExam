package com.taohan.online.exam.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.taohan.online.exam.po.StudentInfo;

/**
  *
  * <p>Title: StudentInfoService</p>
  * <p>Description: </p>
  * @author: dpx
  * @date: 2019-03-01
  */

@Repository
public interface StudentInfoService {

	/**
	 * 查询学生信息集合
	 * @param map
	 * @return
	 */
	public List<StudentInfo> getStudents(Map<String, Object> map);

	/**
	 * 根据id查学生信息
	 * @param studentId
	 * @return
	 */
	public StudentInfo getStudentById(int studentId);

	/**
	 * 更新学生信息
	 * @param student
	 * @return
	 */
	public int isUpdateStudent(StudentInfo student);
	
	/**
	 * 删除学生信息
	 * @param studentId
	 * @return
	 */
	public int isDelStudent(int studentId);
	
	/**
	 * 添加学习信息
	 * @param student
	 * @return
	 */
	public int isAddStudent(StudentInfo student);
	
	/**
	 * 获得学生总数
	 * @return
	 */
	public int getStudentTotal();
	
	/**
	 * 通过账户获得学生登录信息
	 * @param studentAccount
	 * @return
	 */
	public StudentInfo getStudentByAccountAndPwd(String studentAccount);
	
	/**
	 * 重置学习登录密码
	 * @param studentInfo
	 * @return
	 */
	public int isResetPwdWithStu(StudentInfo studentInfo);
	
	/**
	 * 根据班级id查学生信息
	 * @param classId
	 * @return
	 */
	public List<StudentInfo> getStudentsByClassId(int classId);
}
