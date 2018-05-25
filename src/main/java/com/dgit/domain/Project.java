package com.dgit.domain;

import java.util.Date;

public class Project {
	private int projectno;
	private String projectname;
	private String projectcontent;
	private Date regdate;
	private Date enddate;
	private String nowproject;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Project(String projectname, String projectcontent, Date regdate, Date enddate, String nowproject) {
		super();
		this.projectname = projectname;
		this.projectcontent = projectcontent;
		this.regdate = regdate;
		this.enddate = enddate;
		this.nowproject = nowproject;
	}



	public Project(int projectno, String projectname, String text, Date regdate, Date enddate, String nowproject) {
		super();
		this.projectno = projectno;
		this.projectname = projectname;
		this.projectcontent = text;
		this.regdate = regdate;
		this.enddate = enddate;
		this.nowproject = nowproject;
	}

	public int getProjectno() {
		return projectno;
	}

	public void setProjectno(int projectno) {
		this.projectno = projectno;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getprojectcontent() {
		return projectcontent;
	}

	public void setprojectcontent(String projectcontent) {
		this.projectcontent = projectcontent;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getNowproject() {
		return nowproject;
	}

	public void setNowproject(String nowproject) {
		this.nowproject = nowproject;
	}

	@Override
	public String toString() {
		return "Project [projectno=" + projectno + ", projectname=" + projectname + ", projectcontent=" + projectcontent + ", regdate="
				+ regdate + ", enddate=" + enddate + ", nowproject=" + nowproject + "]";
	}

}
