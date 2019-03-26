package com.taohan.online.exam.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.taohan.online.exam.po.SubjectInfo;

/**
  *
  * <p>Title: SubjectInfoService</p>
  * <p>Description: </p>
  * @author: dpx
  * @date: 2019-03-01
  * @version: 1.0
  */

@Repository
public interface SubjectInfoService {

	/**
	 * 获得试题集合
	 * @param map
	 * @return
	 */
	public List<SubjectInfo> getSubjects(Map<String, Object> map);
	
	/**
	 * 根据试题id查试题
	 * @param subjectId
	 * @return
	 */
	public SubjectInfo getSubjectWithId(int subjectId);

	/**
	 * 获得试题总数
	 * @return
	 */
	public int getSubjectTotal();
	
	/**
	 * 添加试题
	 * @param subject
	 * @return
	 */
	public int isAddSubject(SubjectInfo subject);
	
	/**
	 * 更新试题
	 * @param subject
	 * @return
	 */
	public int isUpdateSubject(SubjectInfo subject);

	/**
	 * 删除试题
	 * @param subjectId
	 * @return
	 */
	public int isDelSubject(int subjectId);
	
	/**
	 * 批量增加试题
	 * @param map
	 * @return
	 */
	public int isAddSubjects(Map<String, Object> map);
}
