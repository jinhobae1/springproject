package com.dgit.service;

import java.util.List;

import com.dgit.domain.Criteria;
import com.dgit.domain.Project;

public interface ProjectService {

	public void insertProject(Project pj) throws Exception;
	public Project selectlistProjectByid(int bno) throws Exception;
	public List<Project> selectlistProject() throws Exception;
	public void updateproject(Project vo) throws Exception;
	public void deleteproject(int bno) throws Exception;
	public int totalCount() throws Exception; 
	public void updateViewCnt(int bno)throws Exception;

}
