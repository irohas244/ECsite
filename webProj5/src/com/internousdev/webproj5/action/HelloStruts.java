package com.internousdev.webproj5.action;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.webproj5.dao.HelloStrutsDAO;
import com.internousdev.webproj5.dto.HelloStrutsDTO;
import com.opensymphony.xwork2.ActionSupport;


public class HelloStruts extends ActionSupport implements SessionAware{



	private List<HelloStrutsDTO> hellostrutsDTOList = new ArrayList<HelloStrutsDTO>();
	private Map<String, Object> session;

	public String execute(){
		String ret=ERROR;
		HelloStrutsDAO dao=new HelloStrutsDAO();

		hellostrutsDTOList=dao.select();

		if(hellostrutsDTOList.size() > 0){
			session.put("helloStrutsDTOList", hellostrutsDTOList);
			ret=SUCCESS;
		}else{
			ret=ERROR;
		}
		return ret;
	}

	public Map<String, Object> getSession(){
		return session;

	}

	public void setSession(Map<String, Object> session){

	}
}


