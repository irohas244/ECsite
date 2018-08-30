package com.internousdev.login.ation;

import java.sql.SQLException;

import com.internousdev.login.dao.LoginDAO;
import com.internousdev.login.dto.LoginDTO;

public class LoginAction extends ActionSupport {
	private String name;
	private String password;
	public String execute()throws SQLException{
		String ret = ERROR;
		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();
		
		dto = dao.select(name, password);
		if(name.equals(dto.getName())){
			if(password.equals(dto.getPassowrd())){
				ret = SUCCESS;
			}
		}
		return ret;
	}
	

}
