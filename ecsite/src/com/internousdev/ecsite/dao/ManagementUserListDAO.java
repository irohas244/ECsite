package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.UserListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ManagementUserListDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();


	public ArrayList<UserListDTO> getUserListInfo() {
		String sql = "SELECT  login_id, login_pass,user_name FROM login_user_transaction";
		ArrayList<UserListDTO> userListDTO = new ArrayList<UserListDTO>();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				UserListDTO dto = new UserListDTO();
				dto.setLoginId(resultSet.getString("login_id"));
				dto.setLoginPass(resultSet.getString("login_pass"));
				dto.setUserName(resultSet.getString("user_name"));
				userListDTO.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return userListDTO;
	}

}
