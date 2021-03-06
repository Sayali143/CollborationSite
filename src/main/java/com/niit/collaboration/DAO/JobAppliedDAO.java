package com.niit.collaboration.DAO;

import java.util.List;

import com.niit.collaboration.model.JobApplied;

public interface JobAppliedDAO {
	
	public boolean applyNew(JobApplied jobApplied);
	
	public List<JobApplied> listByUser(String username);
	
	public List<JobApplied> listByCompany(String title);

}
