package com.lhh.crmsystem.service;

import java.util.List;

import com.lhh.crmsystem.entity.Employee;

public interface IEmployeeService {
	/**
	 * 通过用户账号和密码登录 用户账号为邮箱
	 * 
	 * @param username
	 * @param pass
	 * @return
	 */
	public Employee login(String username, String pass);

	public int insertEmployee(Employee employee);

	public int insertAdmin(Employee employee);

	public int deleteEmployee(Integer id);

	public int updateEmployee(Employee employee);

	public Employee updateEmployeeByObj(Employee employee);

	public Employee queryEmployee(Integer id);

	public List<Employee> queryAll();
}
