package com.dgit.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dgit.domain.Project;



public interface ProjectDao {
	
public void insertProject(Project project) throws Exception;

public Project selectlistProjectByid(int number) throws Exception;

public void deleteproject(int number) throws Exception;

public List<Project> selectlistProject() throws Exception;

void updateproject(Project project) throws Exception;



}
