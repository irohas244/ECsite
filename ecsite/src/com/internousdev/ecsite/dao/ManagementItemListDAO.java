package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ManagementItemListDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();


	public ArrayList<ItemListDTO> getItemListInfo() {
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



public int buyItemHistoryDelete
(String item_transaction_id, String user_master_id) throws SQLException {
	String sql = "DELETE FROM user_buy_item_transaction WHERE	item_transaction_id = ? AND user_master_id = ?";
	PreparedStatement preparedStatement;
	int result =0;
	try {
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, item_transaction_id);
		preparedStatement.setString(2, user_master_id);
		result = preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		connection.close();
	}
	return result;
}
}
