package com.merilytics.dto;

import java.io.Serializable;

public class LoginDTO implements Serializable {
	private String uName;
	private String pwd;

	public String getuName() {
		return uName;
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
