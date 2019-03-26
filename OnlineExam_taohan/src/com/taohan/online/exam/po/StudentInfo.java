package com.taohan.online.exam.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: StudentInfo</p>
  * <p>Description: </p>
  * @author: dpx
  * @date: 2019-03-01
  */

@Component
@Scope("prototype")
public class StudentInfo {

	/**
	 * 学生id
	 */
	private Integer studentId;
	/**
	 * 学生姓名
	 */
	private String studentName;
	/**
	 * 学生账号
	 */
	private String studentAccount;
	/**
	 * 学生密码
	 */
	private String studentPwd;
	/**
	 * 班级信息
	 */
	private ClassInfo classInfo;
	/**
	 * 年级信息
	 */
	private GradeInfo grade;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAccount() {
		return studentAccount;
	}

	public void setStudentAccount(String studentAccount) {
		this.studentAccount = studentAccount;
	}

	public String getStudentPwd() {
		return studentPwd;
	}

	public void setStudentPwd(String studentPwd) {
		this.studentPwd = studentPwd;
	}

	public ClassInfo getClassInfo() {
		return classInfo;
	}

	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}

	public GradeInfo getGrade() {
		return grade;
	}

	public void setGrade(GradeInfo grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "StudentInfo [studentId=" + studentId + ", studentName="
				+ studentName + ", studentAccount=" + studentAccount
				+ ", studentPwd=" + studentPwd + ", classInfo=" + classInfo
				+ ", grade=" + grade + "]";
	}
}
