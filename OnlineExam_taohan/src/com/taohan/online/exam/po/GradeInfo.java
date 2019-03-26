package com.taohan.online.exam.po;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: GradeInfo</p>
  * <p>Description: 年级实体类</p>
  * @author: dpx
  * @date: 2019-03-01
  */

@Component
@Scope("prototype")
public class GradeInfo {

	/**
	 * 年级id
	 */
	private Integer gradeId;
	/**
	 * 年级名
	 */
	private String gradeName;

	public Integer getGradeId() {
		return gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public GradeInfo(Integer gradeId) {
		super();
		this.gradeId = gradeId;
	}

	public GradeInfo() {
		super();
	}

	@Override
	public String toString() {
		return "GradeInfo [gradeId=" + gradeId + ", gradeName=" + gradeName
				+ "]";
	}

}