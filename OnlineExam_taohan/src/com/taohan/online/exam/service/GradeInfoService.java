package com.taohan.online.exam.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.taohan.online.exam.po.GradeInfo;

/**
  *
  * <p>Title: GradeInfoService</p>
  * <p>Description: </p>
  * @author: dpx
  * @date: 2019-03-04
  */

@Repository
public interface GradeInfoService {

	/**
	 * 获取所有年级
	 * @return
	 */
	public List<GradeInfo> getGrades();
	
	/**
	 * 根据编号获取年级
	 * @param gradeId
	 * @return
	 */
	public GradeInfo getGradeById(int gradeId);
	
	/**
	 * 添加年级
	 * @param grade
	 * @return
	 */
	public int isAddGrade(GradeInfo grade);
	
	/**
	 * 删除年级
	 * @param gradeId
	 * @return
	 */
	public int isDelGrade(int gradeId);
	
	/**
	 * 修改年级
	 * @param grade
	 * @return
	 */
	public int isUpdateGrade(GradeInfo grade);
}
