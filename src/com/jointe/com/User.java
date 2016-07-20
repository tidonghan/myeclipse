package com.jointe.com;

import java.util.Date;

/**
 * @Title: User
 * @Description:
 * @Author: htd
 * @Date: 2016-7-20
 * @Version: v1.0.0
 * @Copyright: 2016 www.jointem.com Inc. All rights reserved.
 * @Update: 1. Create File
 */
public class User {
	private Integer id;

	private String userName;

	private String password;

	private Date lastLogin;

	private Integer isDelte;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the lastLogin
	 */
	public Date getLastLogin() {
		return lastLogin;
	}

	/**
	 * @param lastLogin
	 *            the lastLogin to set
	 */
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	/**
	 * @return the isDelte
	 */
	public Integer getIsDelte() {
		return isDelte;
	}

	/**
	 * @param isDelte
	 *            the isDelte to set
	 */
	public void setIsDelte(Integer isDelte) {
		this.isDelte = isDelte;
	}

}
