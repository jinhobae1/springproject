package com.dgit.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dgit.domain.Project;

@Repository
public class ProjectDAOImpl implements ProjectDao{
	
	@Autowired
	SqlSession session;
	
	private static final String namespace = "com.dgit.mapper.ProjectMapper";

	@Override
	public List<Project> selectlistProject() {
		return session.selectList(namespace+".selectlistProject");
	}

	@Override
	public void insertProject(Project project)throws Exception {
		session.insert(namespace + ".insertProject", project);
	}

	@Override
	public Project selectlistProjectByid(int number) throws Exception{
		return session.selectOne(namespace + ".selectlistProjectByid", number);
	}

	@Override
	public void updateproject(Project project)  throws Exception{
		session.update(namespace + ".updateproject", project);
	}

	@Override
	public void deleteproject(int number)throws Exception {
		session.delete(namespace + ".deleteproject", number);
	}


}
