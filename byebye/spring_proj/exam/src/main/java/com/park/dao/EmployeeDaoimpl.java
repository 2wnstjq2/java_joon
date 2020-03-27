package com.park.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.park.model.EmployeeVo;

@Repository
public class EmployeeDaoimpl implements EmployeeDao{

	public List<EmployeeVo> getAllEmployees()
	{
		List<EmployeeVo> employees = new ArrayList<EmployeeVo>();
		
		EmployeeVo vo1 = new EmployeeVo();
		vo1.setId(1);
		vo1.setfName("park");
		vo1.setlName("sub");
		employees.add(vo1);
		
		EmployeeVo vo2 = new EmployeeVo();
		vo2.setId(2);
		vo2.setfName("kim");
		vo2.setlName("ssi");
		employees.add(vo2);
		
		return employees;
	}
	
	
}
