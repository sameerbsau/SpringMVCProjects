package com.merilytics.dto;

import java.io.Serializable;

public class UsersDTO implements Serializable {
	private int userID;
	private String uName;
	private String pwd;

	public String getuName() {
		return uName;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
