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
	private String name;
	/** 密码 */
	private String pwd;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String username, String password) {
		super();
		this.name = username;
		this.pwd = password;
	}



	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}







}
