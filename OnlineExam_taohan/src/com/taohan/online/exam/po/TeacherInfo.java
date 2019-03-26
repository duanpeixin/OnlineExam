package com.taohan.online.exam.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: TeacherInfo</p>
  * <p>Description: 教师实体类</p>
  * @author: dpx
  * @date: 2019-03-01
  */

@Component
@Scope("prototype")
public class TeacherInfo {
	/**
	 * 教师id
	 */
	private Integer teacherId;
	/**
	 * 教师姓名
	 */
	private String teacherName;
	/**
	 * 教师账号
	 */
	private String teacherAccount;
	/**
	 * 教师密码
	 */
	private String teacherPwd;
	/**
	 * 教师职位(1管理员0普通职工)
	 */
	private int adminPower;
	/**
	 * 是否在职(1在职0不在)
	 */
	private Integer isWork;
	/**
	 * 所管班级
	 */
	private ClassInfo classInfo;
	/**
	 * 教师性别
	 */
	private String teacherSex;

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherAccount() {
		return teacherAccount;
	}

	public void setTeacherAccount(String teacherAccount) {
		this.teacherAccount = teacherAccount;
	}

	public String getTeacherPwd() {
		return teacherPwd;
	}

	public void setTeacherPwd(String teacherPwd) {
		this.teacherPwd = teacherPwd;
	}

	public int getAdminPower() {
		return adminPower;
	}

	public void setAdminPower(int adminPower) {
		this.adminPower = adminPower;
	}

	public Integer getIsWork() {
		return isWork;
	}

	public void setIsWork(Integer isWork) {
		this.isWork = isWork;
	}

	public ClassInfo getClassInfo() {
		return classInfo;
	}

	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}

	@Override
	public String toString() {
		return "TeacherInfo [teacherId=" + teacherId + ", teacherName="
				+ teacherName + ", teacherAccount=" + teacherAccount
				+ ", teacherPwd=" + teacherPwd + ", adminPower=" + adminPower
				+ ", isWork=" + isWork + "]";
	}

	public String getTeacherSex() {
		return teacherSex;
	}

	public void setTeacherSex(String teacherSex) {
		this.teacherSex = teacherSex;
	}

}
