package com.taohan.online.exam.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.taohan.online.exam.po.ClassInfo;

/**
  *
  * <p>Title: ClassInfoService</p>
  * <p>Description: 班级信息 Service</p>
  * @author: dpx
  * @date: 2019-03-01
  */

@Repository
public interface ClassInfoService {

	/**
	 * 获取班级集合
	 * @param classInfo
	 * @return
	 */
	public List<ClassInfo> getClasses(ClassInfo classInfo);

	/**
	 * 添加班级
	 * @param classInfo
	 * @return
	 */
	public int isAddClass(ClassInfo classInfo);

	/**
	 *  删除班级
	 * @param classId
	 * @return
	 */
	public int isDelClass(int classId);

	/**
	 * 根据编号获取班级信息
	 * @param classId
	 * @return
	 */
	public ClassInfo getClassById(int classId);
	
	/**
	 * 根据当前班级班主任编号获取当前班级信息
	 * @param teacherId
	 * @return
	 */
	public ClassInfo getClassByTeacherId(int teacherId);

	/**
	 * 修改班级信息
	 * @param classInfo
	 * @return
	 */
	public int isUpdateClass(ClassInfo classInfo);
	
	/**
	 * 获取指定年级下的班级集合
	 * @param gradeId
	 * @return
	 */
	public List<ClassInfo> getClassByGradeId(int gradeId);
	
	/**
	 * 获取各(指定年级下)班级下的学生总量
	 * @param gradeId
	 * @return
	 */
	public Map<String, Object> getStudentCountForClass(Integer gradeId);
}
