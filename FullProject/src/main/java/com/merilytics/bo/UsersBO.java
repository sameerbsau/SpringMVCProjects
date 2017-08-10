package com.merilytics.bo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="users")
@NamedQueries({ @NamedQuery(name = "query", query = "select count(1) from UsersBO where email=:val1 and password =:val2") })
public class UsersBO {
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	@Id
	private int userID;
	private String email;
	private String password;
	private boolean enabled;
	

	@Override
	public String toString() {
		return "UsersBO [userID=" + userID + ", email=" + email + ", password=" + password + ", enabled=" + enabled
				+ "]";
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
