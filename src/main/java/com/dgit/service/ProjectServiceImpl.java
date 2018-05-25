package com.dgit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dgit.domain.Project;
import com.dgit.persistence.ProjectDao;



@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectDao dao;
	
	@Transactional
	@Override
	public void insertProject(Project pj) throws Exception {
		dao.insertProject(pj);
		
	}

	@Override
	public Project selectlistProjectByid(int bno) throws Exception {
		return dao.selectlistProjectByid(bno);
	
	}

	@Override
	public List<Project> selectlistProject() throws Exception {
		return dao.selectlistProject();
	}

	@Override
	public void updateproject(Project project) throws Exception {
		dao.updateproject(project);
		
	}

	@Override
	public void deleteproject(int bno) throws Exception {
		dao.deleteproject(bno);
		
	}

	@Override
	public int totalCount() throws Exception {
		
		return 0;
	}

	@Override
	public void updateViewCnt(int bno) throws Exception {
	
	}



}
