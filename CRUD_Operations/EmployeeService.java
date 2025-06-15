package com.service;

import com.dao.EmployeeDao;

public class EmployeeService {

	public void insertData() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.insertData();
	}

	public void updateData() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.updateData();

	}

	public void deleteData() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.deleteData();

	}

	public void showData() throws Exception {
		EmployeeDao ed = new EmployeeDao();
		ed.showData();
	}

}
