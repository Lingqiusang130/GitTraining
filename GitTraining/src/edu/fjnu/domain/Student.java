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
	private String pwd1;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String username, String password) {
		super();
		this.username = username;
		this.pwd1 = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd1() {
		return pwd1;
	}

	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}





}
