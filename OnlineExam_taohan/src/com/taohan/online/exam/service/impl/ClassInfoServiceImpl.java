package com.taohan.online.exam.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;

import com.taohan.online.exam.dao.ClassInfoMapper;
import com.taohan.online.exam.po.ClassInfo;
import com.taohan.online.exam.service.ClassInfoService;

/**
  *
  * <p>Title: ClassInfoServiceImpl</p>
  * <p>Description: 班级信息 Service 实现类</p>
  * @author: dpx
  * @date: 2019-03-01
  */

@Service
public class ClassInfoServiceImpl implements ClassInfoService {

	@Autowired
	private ClassInfoMapper classInfoMapper;
	
	//获取班级集合
	public List<ClassInfo> getClasses(ClassInfo classInfo) {
		return classInfoMapper.getClasses(classInfo);
	}

	//添加班级
	public int isAddClass(ClassInfo classInfo) {
		return classInfoMapper.isAddClass(classInfo);
	}

	//删除班级
	public int isDelClass(int classId) {
		return classInfoMapper.isDelClass(classId);
	}

	public ClassInfo getClassById(int classId) {
		return classInfoMapper.getClassById(classId);
	}

	public int isUpdateClass(ClassInfo classInfo) {
		return classInfoMapper.isUpdateClass(classInfo);
	}

	//获取指定年级下的班级
	public List<ClassInfo> getClassByGradeId(int gradeId) {
		return classInfoMapper.getClassByGradeId(gradeId);
	}

	//获取各(指定年级下)班级下的学生总量
	public Map<String, Object> getStudentCountForClass(Integer gradeId) {
		return classInfoMapper.getStudentCountForClass(gradeId);
	}

	//根据当前班级班主任编号获取当前班级信息
	public ClassInfo getClassByTeacherId(int teacherId) {
		return classInfoMapper.getClassByTeacherId(teacherId);
	}
	
	@Bean
    public TaskScheduler scheduledExecutorService() {
     ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler(); 
     scheduler.setPoolSize(8); 
     scheduler.setThreadNamePrefix("scheduled-thread-"); 
     return scheduler; 
     }



}
