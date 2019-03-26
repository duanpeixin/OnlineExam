package com.taohan.online.exam.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.taohan.online.exam.po.ExamChooseInfo;

/**
  *
  * <p>Title: ExamChooseInfoService</p>
  * <p>Description: </p>
  * @author: dpx
  * @date: 2019-03-10
  */

@Repository
public interface ExamChooseInfoService {

	public ExamChooseInfo getChooseWithIds(Map<String, Object> map);

	public int updateChooseWithIds(ExamChooseInfo examChoose);
	
	public int addChoose(Map<String, Object> map);
	
	public List<ExamChooseInfo> getChooseInfoWithSumScore(Map<String, Object> map);
	
	public List<ExamChooseInfo> getChooseInfoWithExamSubject(Map<String, Object> map);
}
