package com.fendo.dao;

import java.util.List;

import com.fendo.entity.Admin;

public interface AdminDao {
	
	public List<Admin> getAdmins(Admin admin);
	
	public void addAdmin(Admin admin); 

}
