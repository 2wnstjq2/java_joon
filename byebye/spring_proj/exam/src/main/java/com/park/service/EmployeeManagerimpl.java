package com.park.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.park.dao.EmployeeDao;
import com.park.model.EmployeeVo;

@Service
@Repository
public class EmployeeManagerimpl implements EmployeeManager{

	@Autowired
	EmployeeDao dao;
	
	public List<EmployeeVo> getAllEmployees()
	{
		return dao.getAllEmployees();
	}
	
	
}
