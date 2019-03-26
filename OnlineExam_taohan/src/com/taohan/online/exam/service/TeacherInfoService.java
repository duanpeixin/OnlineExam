package com.taohan.online.exam.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.taohan.online.exam.po.TeacherInfo;

/**
  *
  * <p>Title: TeacherInfoService</p>
  * <p>Description: </p>
  * @author: dpx
  * @date: 2019-03-06
  */

@Repository
public interface TeacherInfoService {

	/**
	 * 获取教师集合
	 * @param map
	 * @return
	 */
	public List<TeacherInfo> getTeachers(Map<String, Object> map);
	
	/**
	 * 根据教师账户获取教师信息
	 * @param teacherAccount
	 * @return
	 */
	public TeacherInfo getTeacherByAccount(String teacherAccount);
	
	/**
	 * 获取教师数据总量
	 * @return
	 */
	public int getTeacherTotal();
	
	/**
	 * 修改教师班主任状态
	 * @param teacherInfo
	 * @return
	 */
	public int updateTeacherIsWork(TeacherInfo teacherInfo);
	
	/**
	 * 根据教师编号获取教师信息
	 * @param teacherId
	 * @return
	 */
	public TeacherInfo getTeacherById(int teacherId);
	
	/**
	 * 修改教师信息
	 * @param teacher
	 * @return
	 */
	public int isUpdateTeacherInfo(TeacherInfo teacher);
	
	/**
	 * 添加教师信息
	 * @param teacher
	 * @return
	 */
	public int isAddTeacherInfo(TeacherInfo teacher);
	
	/**
	 * 删除教师信息
	 * @param teacherId
	 * @return
	 */
	public int isDelTeacherInfo(int teacherId);
}
