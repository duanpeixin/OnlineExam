package com.taohan.online.exam.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: ClassInfo</p>
  * <p>Description: 班级实体类</p>
  * @author: dpx
  * @date: 2019-03-01
  */

@Component
@Scope("prototype")
public class ClassInfo {
	/**
	 * 班级id
	 */
	private Integer classId;
	/**
	 * 班级名称
	 */
	private String className;
	/**
	 * 年级
	 */
	private GradeInfo grade;
	/**
	 * 老师
	 */
	private TeacherInfo teacher;

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public GradeInfo getGrade() {
		return grade;
	}

	public void setGrade(GradeInfo grade) {
		this.grade = grade;
	}

	public TeacherInfo getTeacher() {
		return teacher;
	}

	public void setTeacher(TeacherInfo teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "ClassInfo [classId=" + classId + ", className=" + className
				+ ", grade=" + grade + "]";
	}

}
