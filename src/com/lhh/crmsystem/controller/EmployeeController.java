package com.lhh.crmsystem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lhh.crmsystem.entity.Employee;
import com.lhh.crmsystem.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService empService;

	@RequestMapping("/login")
	public String login(String username, String pass, HttpServletRequest request, HttpServletResponse response) {
		Employee employee = empService.login(username, pass);
		HttpSession session = request.getSession();
		session.setAttribute("employee", employee);
		if (employee != null) {
			if ("1".equals(employee.getWorkStatu())) {
				return "/view/frame/main.jsp";
			} else {
				try {
					PrintWriter out = response.getWriter();
					response.setContentType("text/html;charset=utf-8");
					out.flush();
					out.println("<script>javascript:alert('用户未激活或已离职！');history.back();</script>");
				} catch (IOException e) {
					e.printStackTrace();
				}
				return "/login.jsp";
			}
		} else {
			try {
				PrintWriter out = response.getWriter();
				response.setContentType("text/html;charset=utf-8");
				out.flush();
				out.println("<script>javascript:alert('账号或密码错误！请重新输入！');history.back();</script>");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "/login.jsp";
		}
	}
}