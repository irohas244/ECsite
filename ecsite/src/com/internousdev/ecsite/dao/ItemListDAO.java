package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {

	public ArrayList<ItemListDTO> getItemListInfo() {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String sql = "SELECT  item_name, item_price,item_stock FROM item_info_transaction";
		ArrayList<ItemListDTO> itemListDTO = new ArrayList<ItemListDTO>();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				ItemListDTO dto = new ItemListDTO();
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getInt("item_price"));
				dto.setItemStock(resultSet.getInt("item_stock"));
				itemListDTO.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return itemListDTO;
	}



public int itemListDelete() throws SQLException {
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	String sql = "DELETE FROM item_info_transaction";
	PreparedStatement preparedStatement;
	int result =0;
	try {
		preparedStatement = connection.prepareStatement(sql);

		result = preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		connection.close();
	}
	return result;
}
}

