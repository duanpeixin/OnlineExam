package com.taohan.online.exam.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: ExamSubjectMiddleInfo</p>
  * <p>Description: 试卷、试题中间关联表</p>
   * @author: dpx
  * @date: 2019-03-06
  */

@Component
@Scope("prototype")
public class ExamSubjectMiddleInfo {

	private Integer esmId;
	private ExamPaperInfo examPaper;
	private SubjectInfo subject;

	public Integer getEsmId() {
		return esmId;
	}

	public void setEsmId(Integer esmId) {
		this.esmId = esmId;
	}

	public ExamPaperInfo getExamPaper() {
		return examPaper;
	}

	public void setExamPaper(ExamPaperInfo examPaper) {
		this.examPaper = examPaper;
	}

	public SubjectInfo getSubject() {
		return subject;
	}

	public void setSubject(SubjectInfo subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "ExamSubjectMiddleInfo [esmId=" + esmId + ", examPaper="
				+ examPaper + ", subject=" + subject + "]";
	}
}
