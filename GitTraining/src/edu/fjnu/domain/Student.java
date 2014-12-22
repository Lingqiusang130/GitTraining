/**
 * 
 */
package edu.fjnu.domain;

/**
 * @author lingqiusang
 * 
 */
public class Student {

	/** 用户名 */
	private String username;
	/** 密码 */
	private String pwd;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String username, String password) {
		super();
		this.username = username;
		this.pwd = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}







}
