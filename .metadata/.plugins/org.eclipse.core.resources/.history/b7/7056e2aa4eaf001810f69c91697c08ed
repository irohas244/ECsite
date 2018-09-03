package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ManagementUserListDAO;
import com.internousdev.ecsite.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ManagementUserListAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private ManagementUserListDAO managementUserListDAO = new ManagementUserListDAO();
	private ArrayList<UserListDTO> userList = new ArrayList<UserListDTO>();
	private String deleteFlg;
	private String message;


	public String execute() throws SQLException {
		if (!session.containsKey("id")) {     //	ログインした状態でなければエラーとなる
			return ERROR;
		}

		if(deleteFlg == null) {
			userList= managementUserListDAO.getUserListInfo();
		} else if(deleteFlg.equals("1")) {
//			delete();
		}
		String result = SUCCESS;
		return result;
	}



	public void delete() throws SQLException {


		int res = managementUserListDAO.userListDelete();

		if(res > 0) {
			userList = null;
			setMessage("ユーザー情報を正しく削除しました。");
		} else if(res == 0) {
			setMessage("ユーザー情報の削除に失敗しました。");
		}
	}
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
	public ManagementUserListDAO getItemListDAO() {
		return managementUserListDAO;
	}

	public void setUserListDAO(ManagementUserListDAO managementUserListDAO) {
		this.managementUserListDAO = managementUserListDAO;
	}

	public ArrayList<UserListDTO> getuserList() {
		return userList;
	}

	public void setUserList(ArrayList<UserListDTO> userList) {
		this.userList = userList;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}



	public Map<String, Object> getSession() {
		return session;
	}




	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}

